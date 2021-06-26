package com.example.ProfileBackend.repository;

import com.example.ProfileBackend.entity.Ip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpRepository extends JpaRepository<Ip, Long> {
}
