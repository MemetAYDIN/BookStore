package com.example.orderbookproject.service.userservice;

import com.example.orderbookproject.dto.userdto.LoginRequestDto;
import com.example.orderbookproject.dto.userdto.LoginResponseDto;
import com.example.orderbookproject.dto.userdto.SignUpRequestDto;
import com.example.orderbookproject.dto.userdto.SignUpResponseDto;

import jakarta.validation.Valid;

public interface UserService {
    public SignUpResponseDto signUp(@Valid SignUpRequestDto requestDto);

    public LoginResponseDto login(@Valid LoginRequestDto requestDto);
}
