package com.batchprocessing.demo.Service.Implementation;

import com.batchprocessing.demo.Repository.ManfestRepository;
import com.batchprocessing.demo.Service.ManfestService;
import com.batchprocessing.demo.Service.InvoiceService;
import com.batchprocessing.demo.entity.ManfestId;
import com.batchprocessing.demo.entity.InvoiceId;
import com.batchprocessing.demo.entity.ManfestId;
import com.batchprocessing.demo.entity.MatchedStatus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ManfestServiceImpl implements ManfestService {
    @Autowired
    private ManfestRepository manfestRepository;
    @Autowired
    private InvoiceService invoiceService;

    @Override
    public Iterable<ManfestId> getManfestIds() {
        Iterable<InvoiceId> invoiceIds = invoiceService.getInvoiceIds();
        return manfestRepository.findAll();
    }

    public void matchAndSetStatus() {
        Iterable<ManfestId> manfestIds = getManfestIds();
        Iterable<InvoiceId> invoiceIds = invoiceService.getInvoiceIds();

        List<MatchedStatus> matchedStatusList = new ArrayList<>();

        for (ManfestId manfestId : manfestIds) {
            boolean isMatched = false;
            for (InvoiceId invoiceId : invoiceIds) {
                if (manfestId.getId().equals(invoiceId.getId())) {
                    // Match found, update the matchedStatus column
                    manfestId.setMatchedStatus("matched");
                    isMatched = true;

                    MatchedStatus matchedStatus = new MatchedStatus();
                    matchedStatus.setManfestId(manfestId.getId());
                    matchedStatus.setInvoiceId(invoiceId.getId());
                    matchedStatus.setStatus("matched");
                    matchedStatusList.add(matchedStatus);

                    break;
                }

            }

            if (!isMatched) {
                // No match found, update the matchedStatus column accordingly
                manfestId.setMatchedStatus("not matched");

                // Create a MatchedStatus entity and add it to the list
                MatchedStatus matchedStatus = new MatchedStatus();
                matchedStatus.setManfestId(manfestId.getId());
                matchedStatus.setInvoiceId(null); // Set to null if no match
                matchedStatus.setStatus("not matched");
                matchedStatusList.add(matchedStatus);
            }
        }

    }
}
