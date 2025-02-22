package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage(UserDTO user) {
        if (user.getFirstName() != null && user.getLastName() != null) {
            return "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
        } else if (user.getFirstName() != null) {
            return "Hello, " + user.getFirstName() + "!";
        } else if (user.getLastName() != null) {
            return "Hello, " + user.getLastName() + "!";
        } else {
            return "Hello, World!";
        }
    }
}
