package com.example.orderbookproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderbookproject.dto.userdto.RoleType;
import com.example.orderbookproject.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByRoleType(RoleType roleType);

    Optional<UserEntity> findByName(String name);

    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByEmailAndPassword(String email, String password);
}
