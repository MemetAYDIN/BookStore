// package com.example.orderbookproject.service.Token.userservice;
//
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import
// org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
//
// import com.example.orderbookproject.entity.UserEntity;
// import com.example.orderbookproject.repository.UserRepository;
//
// import jakarta.transaction.Transactional;
//
// @Service
// public class UserDetailsServiceImpl implements UserDetailsService {
//
// /**
// * The User repository.
// */
// @Autowired
// private UserRepository userRepository;
//
// @Override
// @Transactional
// public UserDetails loadUserByUsername(String username) throws
// UsernameNotFoundException {
// UserEntity userEntity = userRepository.findByName(username)
// .orElseThrow(() -> new UsernameNotFoundException("User Not Found with
// username: " + username));
//
// return UserDetailsImpl.build(userEntity);
// }
//
// }
//