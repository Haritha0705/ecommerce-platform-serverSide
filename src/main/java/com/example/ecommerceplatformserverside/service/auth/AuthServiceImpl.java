package com.example.ecommerceplatformserverside.service.auth;

import com.example.ecommerceplatformserverside.dto.request.UserRegisterRequest;
import com.example.ecommerceplatformserverside.dto.response.AuthResponse;
import com.example.ecommerceplatformserverside.model.User;
import com.example.ecommerceplatformserverside.repository.AuthRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AuthResponse registerUser(UserRegisterRequest request) {
        try {
            User user = modelMapper.map(request, User.class);
            User savedUser = authRepository.save(user);
            return modelMapper.map(savedUser, AuthResponse.class);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}