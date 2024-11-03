package com.alibou.security;

import com.alibou.security.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TFASecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(TFASecurityApplication.class, args);
    }
}
