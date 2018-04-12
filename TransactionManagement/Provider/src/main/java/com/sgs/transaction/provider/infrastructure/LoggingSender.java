package com.sgs.transaction.provider.infrastructure;

import com.sgs.transaction.api.logging.LoggingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LoggingSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendLogging(){
        jmsTemplate.convertAndSend("logging", new LoggingDTO("seppeg", UUID.randomUUID().toString(), "cbcb6f0c-5f32-42b2-806c-bc47f99adbff","04ec8f47-5365-4983-bb37-6661433d3b01"));
    }

}
