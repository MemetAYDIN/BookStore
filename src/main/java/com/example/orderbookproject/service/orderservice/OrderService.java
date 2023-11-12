package com.example.orderbookproject.service.orderservice;

import java.util.List;

import com.example.orderbookproject.dto.orderdto.OrderRequestByIdDto;
import com.example.orderbookproject.dto.orderdto.OrderRequestDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDetailDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDto;

import jakarta.validation.Valid;

public interface OrderService {
    OrderResponseDto addNewOrder(@Valid OrderRequestDto requestDto);
    List<OrderResponseDetailDto> getOrderById(OrderRequestByIdDto requestDto);
}
