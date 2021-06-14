package com.example.angularBackend.repository;

import com.example.angularBackend.models.chat.ChatGlobal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatGlobalRepository extends JpaRepository<ChatGlobal, Long> {
    ChatGlobal findChatGlobalById(Long id);
}
