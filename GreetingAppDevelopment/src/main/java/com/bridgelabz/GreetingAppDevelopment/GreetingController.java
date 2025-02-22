package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based Dependency Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // ✅ GET Request - Just "Hello, World!"
    @GetMapping
    public String getGreeting() {
        return greetingService.getGreetingMessage(new UserDTO());
    }

    // ✅ GET Request - Pass name via Query Parameters
    @GetMapping("/query")
    public String getGreetingWithQuery(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return greetingService.getGreetingMessage(new UserDTO(firstName, lastName));
    }

    // ✅ GET Request - Pass name via Path Variables
    @GetMapping("/param/{firstName}/{lastName}")
    public String getGreetingWithPath(
            @PathVariable String firstName,
            @PathVariable String lastName) {
        return greetingService.getGreetingMessage(new UserDTO(firstName, lastName));
    }

    // ✅ POST Request - Pass name in JSON Body
    @PostMapping("/post")
    public String getGreetingWithPost(@RequestBody UserDTO user) {
        return greetingService.getGreetingMessage(user);
    }
}
