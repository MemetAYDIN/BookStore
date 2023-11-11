package com.example.orderbookproject.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.orderbookproject.dto.orderdto.OrderRequestDto;
import com.example.orderbookproject.entity.OrderEntity;

@Mapper(uses={BookMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE=Mappers.getMapper(OrderMapper.class);

    OrderEntity toOrderEntity(OrderRequestDto orderRequestDto);
}
