package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // ✅ Save a Greeting Message
    public GreetingMessage saveGreeting(String message) {
        GreetingMessage greeting = new GreetingMessage(message);
        return greetingRepository.save(greeting);
    }

    // ✅ Get all Greeting Messages
    public List<GreetingMessage> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
