package com.batchprocessing.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "intake_manifest_shipment_details")

public class ManfestId {
    @Column(name = "tracking_id")
    private String manfestId;

    public ManfestId(){

    }

    public ManfestId(String manifestId) {
        this.manfestId = manifestId;
    }

    public String getManifestId() {
        return manfestId;
    }

    public void setManifestId(String manifestId) {
        this.manfestId = manifestId;
    }

    public Object getId() {
        return manfestId;
    }

    public void setMatchedStatus(String matched) {
        return;
    }
}

