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
        jmsTemplate.convertAndSend("logging", new LoggingDTO("seppeg", UUID.randomUUID().toString(), "this is a string to log"));
    }

}
