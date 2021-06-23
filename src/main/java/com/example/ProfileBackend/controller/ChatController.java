package com.example.ProfileBackend.controller;

import com.example.ProfileBackend.entity.ChatMessage;
import com.example.ProfileBackend.noEntity.ChatRestForm;
import com.example.ProfileBackend.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ChatController {

    @Autowired
    ChatMessageRepository chatMessageRepository;

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public ChatMessage greeting(ChatRestForm chatRestForm) throws Exception {
        Thread.sleep(1000); // simulated delay
        ChatMessage chatMessage
                = new ChatMessage(null, chatRestForm.getUsername(), chatRestForm.getMessage());
        chatMessageRepository.save(chatMessage);
        return chatMessage;
    }

    @GetMapping("api/chat/all")
    public List<ChatMessage> AllChatMessages() {
        return chatMessageRepository.findAll();
    }
}
