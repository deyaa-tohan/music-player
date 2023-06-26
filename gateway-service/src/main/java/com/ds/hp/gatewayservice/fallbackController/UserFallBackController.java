package com.ds.hp.gatewayservice.fallbackController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFallBackController {
    @GetMapping("/UserServiceFallBack")
    public String userServiceFallBackMethode() {
        return "The User Service Currently Unavailable";
    }
}
