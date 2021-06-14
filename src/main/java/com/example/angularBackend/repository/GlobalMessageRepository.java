package com.example.angularBackend.repository;

import com.example.angularBackend.models.chat.GlobalMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalMessageRepository extends JpaRepository<GlobalMessage, Long> {
}
