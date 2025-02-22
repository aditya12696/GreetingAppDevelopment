package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // ✅ GET: Fetch Greeting Message by ID
    @GetMapping("/{id}")
    public ResponseEntity<GreetingMessage> getGreetingById(@PathVariable Long id) {
        Optional<GreetingMessage> greeting = greetingService.getGreetingById(id);
        return greeting.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}


//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // ✅ GET: Fetch all stored greetings
//    @GetMapping("/all")
//    public List<GreetingMessage> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//
//    // ✅ POST: Create & store greeting message
//    @PostMapping("/post")
//    public String createGreeting(@RequestBody UserDTO user) {
//        return greetingService.getGreetingMessage(user);
//    }
//}
