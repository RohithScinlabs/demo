package com.batchprocessing.demo.entity;

import javax.persistence.*;
@Entity
@Table(name = "matched_status")
public class MatchedStatus {
    @Column(name = "manfest_id")
    private String manfestId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "status")
    private String status;

    public String getManfestId() {
        return manfestId;
    }

    public void setManfestId(String manfestId) {
        this.manfestId = manfestId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MatchedStatus(String manfestId, String invoiceId, String status) {
        this.manfestId = manfestId;
        this.invoiceId = invoiceId;
        this.status = status;
    }
}
