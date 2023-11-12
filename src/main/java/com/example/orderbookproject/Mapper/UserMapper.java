package com.example.orderbookproject.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.orderbookproject.dto.orderdto.OrderRequestByIdDto;
import com.example.orderbookproject.dto.orderdto.OrderRequestDto;
import com.example.orderbookproject.entity.UserEntity;

@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE=Mappers.getMapper(UserMapper.class);

    UserEntity toUserEntity(OrderRequestDto requestDto);
    UserEntity toUserEntityByUserId(OrderRequestByIdDto requestByIdDto);

}
