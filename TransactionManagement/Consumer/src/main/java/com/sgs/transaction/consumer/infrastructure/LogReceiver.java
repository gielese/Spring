package com.sgs.transaction.consumer.infrastructure;

import com.sgs.transaction.api.logging.LoggingDTO;
import com.sgs.transaction.consumer.domain.Logging;
import com.sgs.transaction.consumer.domain.LoggingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class LogReceiver {

    @Autowired
    private LoggingRepository loggingRepository;

    @Transactional
    @JmsListener(destination = "logging")
    public void receiveMessage(LoggingDTO log){
        loggingRepository.save(new Logging(log.getUsername(), log.getUuidRemote(), log.getStringToLog()));
    }

}
