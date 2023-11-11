package com.example.orderbookproject.service.orderservice;

import com.example.orderbookproject.dto.orderdto.OrderRequestByIdDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDetailDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDto;
import com.example.orderbookproject.entity.OrderEntity;

public interface OrderService {
    OrderResponseDto addNewOrder(OrderEntity entity);
    OrderResponseDetailDto getOrderById(OrderRequestByIdDto requestDto);
}
