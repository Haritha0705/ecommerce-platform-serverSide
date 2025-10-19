package com.example.ecommerceplatformserverside.service.auth;

import com.example.ecommerceplatformserverside.dto.request.UserRegisterRequest;
import com.example.ecommerceplatformserverside.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse registerUser(UserRegisterRequest request);
}