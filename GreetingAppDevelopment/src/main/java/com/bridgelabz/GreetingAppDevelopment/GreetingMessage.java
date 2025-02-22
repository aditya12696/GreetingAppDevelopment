package com.bridgelabz.GreetingAppDevelopment;

import jakarta.persistence.*;

@Entity
public class GreetingMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    // Constructors
    public GreetingMessage() {}

    public GreetingMessage(String message) {
        this.message = message;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}



//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "greetings")
//public class GreetingMessage {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String message;
//
//    // Default Constructor
//    public GreetingMessage() {}
//
//    // Constructor
//    public GreetingMessage(String message) {
//        this.message = message;
//    }
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}
