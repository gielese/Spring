package com.sgs.transaction.provider.controller;

import com.sgs.transaction.provider.infrastructure.LoggingSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @Autowired
    private LoggingSender loggingSender;

    @PostMapping("/log")
    public void logging(){
      loggingSender.sendLogging();
    }

}
