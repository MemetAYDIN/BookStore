package com.example.orderbookproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbookproject.dto.userdto.LoginRequestDto;
import com.example.orderbookproject.dto.userdto.LoginResponseDto;
import com.example.orderbookproject.dto.userdto.SignUpRequestDto;
import com.example.orderbookproject.dto.userdto.SignUpResponseDto;
import com.example.orderbookproject.service.userservice.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDto> signUp(@RequestBody SignUpRequestDto requestDto) {
        return ResponseEntity.ok().body(userService.signUp(requestDto));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto requestDto) {
        return ResponseEntity.ok().body(userService.login(requestDto));
    }

}
