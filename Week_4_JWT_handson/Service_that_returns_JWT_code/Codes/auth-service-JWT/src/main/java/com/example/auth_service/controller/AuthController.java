package com.example.auth_service.controller;


import com.example.auth_service.dto.UserDto;
import com.example.auth_service.dto.UserSignupRequestDto;
import com.example.auth_service.services.AuthService;
import com.example.auth_service.services.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping
public class AuthController {



    private JwtService jwtService;

    public AuthController(JwtService jwtService){
        this.jwtService=jwtService;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?>signUp(@RequestBody UserSignupRequestDto passengerSignupRequestDto ){

        String username = passengerSignupRequestDto.getUsername();
        String password = passengerSignupRequestDto.getPassword();

        Map<String , Object> mp = new HashMap<>();
        mp.put("username" , username);
        mp.put("password" , password );
        String token = jwtService.createToken(mp , username);

        String result = "JWT TOKEN ::  " + token;

        return new  ResponseEntity<>(result ,HttpStatus.ACCEPTED);
    }


}
