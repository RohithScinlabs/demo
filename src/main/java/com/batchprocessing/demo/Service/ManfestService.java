package com.batchprocessing.demo.Service;
import com.batchprocessing.demo.entity.ManfestId;

public interface ManfestService {
    public Iterable<ManfestId> getManfestIds();
}
