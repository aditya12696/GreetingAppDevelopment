package com.bridgelabz.GreetingAppDevelopment;

public class GreetingDTO {
    private String message;

    // Constructor
    public GreetingDTO(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
