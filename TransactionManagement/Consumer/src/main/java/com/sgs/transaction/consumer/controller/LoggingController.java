package com.sgs.transaction.consumer.controller;

import com.sgs.transaction.consumer.domain.LoggingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoggingController {

    @Autowired
    private LoggingRepository loggingRepository;

    @GetMapping("/logging/{uuid}")
    public String logging(@PathVariable String uuid, Model model){
        model.addAttribute("loggings", loggingRepository.findById(uuid).get());
        return "loggings";
    }

    @GetMapping("/loggings")
    public String product(@RequestParam("username") String username, Model model){
        model.addAttribute("loggings", loggingRepository.findByUsername(username));
        return "loggings";
    }


    @GetMapping(value = "/")
    public String loggingList(Model model){
        model.addAttribute("loggings", loggingRepository.findAll());
        return "loggings";
    }

}
