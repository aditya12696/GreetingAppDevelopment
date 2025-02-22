package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Fetch Greeting Message by ID
    public Optional<GreetingMessage> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}




//import org.springframework.stereotype.Service;
//
//@Service
//public class GreetingService {
//
//    public String getGreetingMessage(UserDTO user) {
//        if (user.getFirstName() != null && user.getLastName() != null) {
//            return "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
//        } else if (user.getFirstName() != null) {
//            return "Hello, " + user.getFirstName() + "!";
//        } else if (user.getLastName() != null) {
//            return "Hello, " + user.getLastName() + "!";
//        } else {
//            return "Hello, World!";
//        }
//    }
//}
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    public String getGreetingMessage(UserDTO user) {
//        String message;
//
//        if (user.getFirstName() != null && user.getLastName() != null) {
//            message = "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
//        } else if (user.getFirstName() != null) {
//            message = "Hello, " + user.getFirstName() + "!";
//        } else if (user.getLastName() != null) {
//            message = "Hello, " + user.getLastName() + "!";
//        } else {
//            message = "Hello, World!";
//        }
//
//        // Save the message in the database
//        greetingRepository.save(new GreetingMessage(message));
//        return message;
//    }
//
//    // Fetch all greetings from the database
//    public List<GreetingMessage> getAllGreetings() {
//        return greetingRepository.findAll();
//    }
//}

//import java.util.Optional;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    // Find Greeting Message by ID
//    public Optional<GreetingMessage> getGreetingById(Long id) {
//        return greetingRepository.findById(id);
//    }
//}