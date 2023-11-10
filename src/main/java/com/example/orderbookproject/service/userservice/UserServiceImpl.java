package com.example.orderbookproject.service.userservice;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.orderbookproject.dao.userdao.UserDao;
import com.example.orderbookproject.dto.userdto.LoginRequestDto;
import com.example.orderbookproject.dto.userdto.LoginResponseDto;
import com.example.orderbookproject.dto.userdto.RoleType;
import com.example.orderbookproject.dto.userdto.SignUpRequestDto;
import com.example.orderbookproject.dto.userdto.SignUpResponseDto;
import com.example.orderbookproject.entity.UserEntity;
import com.example.orderbookproject.repository.UserRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserDao userDao;

    @Override
    public SignUpResponseDto signUp(@Valid SignUpRequestDto requestDto) {

        // PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // String encodePassword = passwordEncoder.encode(requestDto.getPassword());

        Optional<UserEntity> email = userRepository.findByEmail(requestDto.getEmail());

        UserEntity userEntity = new UserEntity();
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        if (!email.equals(requestDto.getEmail())) {

            userEntity.setName(requestDto.getName());
            userEntity.setEmail(requestDto.getEmail());
            // userEntity.setPassword(encodePassword);
            userEntity.setPassword(requestDto.getPassword());
            userEntity.setCreatedAt(LocalDate.now());
            userEntity.setUpdatedAt(LocalDate.now());

            String strRoles = requestDto.getRole();
            var roleNotFoundExceptionMessage = "Error: Role is not found.";
            if (strRoles.equals("USER")) {
                userEntity.setRoleType(RoleType.USER);
            } else if (strRoles.equals("ADMIN")) {
                userEntity.setRoleType(RoleType.ADMIN);
            } else {
                throw new RuntimeException(roleNotFoundExceptionMessage);
            }
            userRepository.save(userEntity);
            signUpResponseDto.setMessage("User Registered");
        } else {
            var roleNotFoundExceptionMessage = "Error: user already exist.";
            signUpResponseDto.setMessage(roleNotFoundExceptionMessage);
            throw new RuntimeException(roleNotFoundExceptionMessage);
        }

        return signUpResponseDto;

    }

    @Override
    public LoginResponseDto login(@Valid LoginRequestDto requestDto) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        Optional<UserEntity> userCheck = userRepository.findByEmailAndPassword(requestDto.getEmail(),
                requestDto.getPassword());

        // Optional<UserEntity> emailCheck =
        // userRepository.findByEmail(requestDto.getEmail());
        if (userCheck.get().getEmail().equals(requestDto.getEmail())
                && userCheck.get().getPassword().equals(requestDto.getPassword())) {
            loginResponseDto.setMessage("Login Success");
        } else {
            loginResponseDto.setMessage("Login denied");
        }
        return loginResponseDto;
    }

}
