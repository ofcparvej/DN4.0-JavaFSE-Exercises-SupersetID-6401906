package com.example.auth_service.dto;


import com.example.auth_service.model.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String id;
    private String token;
    private String username;
    private String password;  //encrypted


    public static UserDto from(User p){
        return UserDto.builder()
                .id(p.getId().toString())
                .username(p.getUsername())
                .password(p.getPassword())
                .token(p.getToken())
                .build();
    }
}
