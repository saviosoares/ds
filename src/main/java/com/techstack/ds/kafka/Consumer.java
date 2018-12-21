package com.techstack.ds.kafka;

import com.techstack.ds.DsApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(DsApplication.class);


    @KafkaListener(id = "fooGroup", topics = "topic1")
    public void listen(String foo) {
        logger.info("Received: " + foo);
    }

    @KafkaListener(id = "dltGroup", topics = "topic1.DLT")
    public void dltListen(String in) {
        logger.info("Received from DLT: " + in);
    }
}
