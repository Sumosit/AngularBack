package com.example.ProfileBackend.controller;

import com.example.ProfileBackend.entity.Ip;
import com.example.ProfileBackend.repository.IpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class IpController {

    @Autowired
    private IpRepository ipRepository;

    @PostMapping("/api/ip/add")
    public void addIp(@RequestParam String ip) {
        ipRepository.save(new Ip(null, ip));
    }

    @GetMapping("/api/ip/all")
    public List<Ip> allIp() {
        return ipRepository.findAll();
    }
}
