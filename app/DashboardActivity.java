package com.example.dataengineapp.models;

// Used to send login credentials to the Flask API
public class LoginRequest {
    private String email;
    private String pass_key;

    public LoginRequest(String email, String pass_key) {
        this.email = email;
        this.pass_key = pass_key;
    }

    // Required: Retrofit uses getters
    public String getEmail() {
        return email;
    }

    public String getPass_key() {
        return pass_key;
    }
}