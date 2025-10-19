package com.example.ecommerceplatformserverside.repository;

import com.example.ecommerceplatformserverside.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {}
