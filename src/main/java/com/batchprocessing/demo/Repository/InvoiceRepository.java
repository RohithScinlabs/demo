package com.batchprocessing.demo.Repository;

import com.batchprocessing.demo.entity.InvoiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InvoiceRepository extends JpaRepository<InvoiceId, String>{
}

