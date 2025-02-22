package com.bridgelabz.GreetingAppDevelopment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET Method
    @GetMapping
    public GreetingDTO getGreeting() {
        return new GreetingDTO("Hello from GET request!");
    }

    // POST Method
    @PostMapping
    public GreetingDTO postGreeting(@RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Received via POST: " + greeting.getMessage());
    }

    // PUT Method
    @PutMapping
    public GreetingDTO putGreeting(@RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Updated via PUT: " + greeting.getMessage());
    }

    // DELETE Method
    @DeleteMapping
    public GreetingDTO deleteGreeting() {
        return new GreetingDTO("Greeting deleted successfully!");
    }
}
