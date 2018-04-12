package com.sgs.transaction.consumer.infrastructure;

import com.sgs.transaction.api.logging.LoggingDTO;
import com.sgs.transaction.consumer.domain.Logging;
import com.sgs.transaction.consumer.domain.LoggingRepository;
import com.sgs.transaction.producer.domain.Order;
import com.sgs.transaction.producer.domain.OrderRepository;
import com.sgs.transaction.producer.domain.User;
import com.sgs.transaction.producer.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class LogReceiver {

    @Autowired
    private LoggingRepository loggingRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @JmsListener(destination = "logging")
    public void receiveMessage(LoggingDTO log){
        loggingRepository.save(new Logging(log.getUsername(), log.getUuidRemote(), generateStringToLog(log)));
    }

    private String generateStringToLog(LoggingDTO log) {
        return getUserString(log.getUuidUser())+ getOrderString(log.getUuidOrder()) ;
    }

    private String getOrderString(String uuidOrder) {
        return orderRepository.findById(uuidOrder).map(Order::toString).orElse("no order data found");
    }

    private String getUserString(String uuidUser) {
        return userRepository.findById(uuidUser).map(User::toString).orElse("no user data found ");
    }

}
