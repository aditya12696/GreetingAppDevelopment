package com.bridgelabz.GreetingAppDevelopment;

public class UserDTO {
    private String firstName;
    private String lastName;

    // Default Constructor
    public UserDTO() {}

    // Constructor with Parameters
    public UserDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
