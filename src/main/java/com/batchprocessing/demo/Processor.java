package com.batchprocessing.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import com.batchprocessing.demo.entity.ManfestId;


public class Processor implements ItemProcessor<ManfestId, ManfestId> {
    private static final Logger log= LoggerFactory.getLogger(Processor.class);


    @Override
    public ManfestId process(ManfestId item) throws Exception {
        return null;
    }
}
