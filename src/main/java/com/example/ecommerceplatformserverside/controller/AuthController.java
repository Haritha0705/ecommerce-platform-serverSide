package com.example.ecommerceplatformserverside.controller;

import com.example.ecommerceplatformserverside.dto.request.UserRegisterRequest;
import com.example.ecommerceplatformserverside.dto.response.AuthResponse;
import com.example.ecommerceplatformserverside.service.auth.AuthService;
import com.example.ecommerceplatformserverside.util.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserRegisterRequest request) {
        AuthResponse authResponse = authService.registerUser(request);
        return ResponseHandler.generateResponse("Register successful", HttpStatus.OK, authResponse);
    }
}
