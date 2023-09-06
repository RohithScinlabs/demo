package com.batchprocessing.demo.Repository;

import com.batchprocessing.demo.entity.InvoiceId;
import com.batchprocessing.demo.entity.ManfestId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManfestRepository extends JpaRepository<ManfestId, String> {
}


