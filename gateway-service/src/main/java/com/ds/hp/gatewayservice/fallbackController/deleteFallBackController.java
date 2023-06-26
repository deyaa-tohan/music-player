package com.ds.hp.gatewayservice.fallbackController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deleteFallBackController {
    @PostMapping("/deleteSongFallBack")
    public String addNoteFallBackMethode() {
        return "The cancel booking Currently Unavailable";
    }
}
