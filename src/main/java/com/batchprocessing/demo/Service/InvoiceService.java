package com.batchprocessing.demo.Service;

import com.batchprocessing.demo.entity.InvoiceId;

public interface InvoiceService {

    public Iterable<InvoiceId> getInvoiceIds();
}

