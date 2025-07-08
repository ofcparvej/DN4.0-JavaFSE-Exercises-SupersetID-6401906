package com.example.auth_service.services;

import com.example.auth_service.dto.UserDto;
import com.example.auth_service.dto.UserSignupRequestDto;
import com.example.auth_service.model.User;
import com.example.auth_service.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(UserRepository userRepository , BCryptPasswordEncoder bCryptPasswordEncoder){  // coming from configuration
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public UserDto signupUser(UserSignupRequestDto passengerSignupRequestDto){
        User passenger =  User.builder().username(passengerSignupRequestDto.getUsername()).password(bCryptPasswordEncoder.encode(passengerSignupRequestDto.getPassword())).build(); //todo encrypt password
        User newPassenger = userRepository.save(passenger);
        return UserDto.from(newPassenger);


    }



}
