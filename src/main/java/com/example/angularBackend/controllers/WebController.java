package com.example.angularBackend.controllers;

import com.example.angularBackend.models.chat.GlobalMessage;
import com.example.angularBackend.noEntity.Hello;
import com.example.angularBackend.repository.ChatGlobalRepository;
import com.example.angularBackend.repository.GlobalMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    ChatGlobalRepository chatGlobalRepository;
    @Autowired
    GlobalMessageRepository globalMessageRepository;

    @MessageMapping("/hello")
    @SendTo("/topic/hi")
    public Hello greeting(Hello hello) {
        GlobalMessage globalMessage = new GlobalMessage(
                null,
                hello.getUsername(),
                hello.getMessage());
        globalMessageRepository.save(globalMessage);

        return new Hello(hello.getUsername(), hello.getMessage());
    }
}
