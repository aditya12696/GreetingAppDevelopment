package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // ✅ POST: Save Greeting Message
    @PostMapping("/save")
    public ResponseEntity<GreetingMessage> saveGreeting(@RequestParam String message) {
        GreetingMessage savedGreeting = greetingService.saveGreeting(message);
        return ResponseEntity.ok(savedGreeting);
    }

    // ✅ GET: List All Greeting Messages
    @GetMapping("/all")
    public ResponseEntity<List<GreetingMessage>> getAllGreetings() {
        return ResponseEntity.ok(greetingService.getAllGreetings());
    }
}
