package com.batchprocessing.demo.entity;
import javax.persistence.*;

@Table(name = "intake_invoice_carrier2")
@Entity
public class InvoiceId {
    @Column(name = "inv_tracking_id")
    private String invoiceId;

    public InvoiceId(){

    }

    public InvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

}
