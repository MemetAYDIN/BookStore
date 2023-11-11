package com.example.orderbookproject.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.orderbookproject.dto.orderdto.OrderRequestDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDetailDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDto;
import com.example.orderbookproject.entity.OrderEntity;

@Mapper(uses={BookMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE=Mappers.getMapper(OrderMapper.class);

    OrderEntity toOrderEntity(OrderRequestDto orderRequestDto);

    OrderEntity entityToResponse(OrderResponseDetailDto orderResponseDto);

    OrderResponseDetailDto toOrderResponse(OrderEntity entity);
}
