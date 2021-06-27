package com.example.ProfileBackend.repository;

import com.example.ProfileBackend.entity.ChatMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMediaRepository extends JpaRepository<ChatMedia, Long> {
}
