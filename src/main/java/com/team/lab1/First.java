package com.team.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Order(1)
public class First implements CommandLineRunner {
    
    @Override
    public void run(String... args) {
        System.out.println("First");
    }
}
