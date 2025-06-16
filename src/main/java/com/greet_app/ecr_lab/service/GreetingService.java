package com.greet_app.ecr_lab.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GreetingService {
    private static final List<String> EMOJIS = List.of("🚀", "🌟", "✨", "💡", "🔥", "🎉", "😎", "👋", "🧠");
    private final Random random = new Random();
    
    public String greeting(String user) {
        String emoji = EMOJIS.get(random.nextInt(EMOJIS.size()));
        return emoji + " Hello " + user + "! Welcome to your Spring Boot App on AWS Elastic Beanstalk " + emoji;
    }
}
