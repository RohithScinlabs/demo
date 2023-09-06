package com.batchprocessing.demo.Service.Implementation;

import com.batchprocessing.demo.Repository.InvoiceRepository;
import com.batchprocessing.demo.Service.InvoiceService;
import com.batchprocessing.demo.entity.InvoiceId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Override
    public Iterable<InvoiceId> getInvoiceIds() {
        return invoiceRepository.findAll();
    }
}