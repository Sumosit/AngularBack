package com.example.angularBackend.controllers;

import com.example.angularBackend.models.chat.GlobalMessage;
import com.example.angularBackend.repository.GlobalMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class GlobalChatController {

    @Autowired
    GlobalMessageRepository globalMessageRepository;

    @GetMapping("/api/user/global/messages")
    public List<GlobalMessage> getGlobalMessages() {
        return globalMessageRepository.findAll();
    }
}
