package com.example.orderbookproject.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbookproject.Mapper.OrderMapper;
import com.example.orderbookproject.dto.orderdto.OrderRequestByIdDto;
import com.example.orderbookproject.dto.orderdto.OrderRequestDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDetailDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDto;
import com.example.orderbookproject.entity.OrderEntity;
import com.example.orderbookproject.service.orderservice.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OderController {

    private final OrderService orderService;

    public OderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/neworder")
    public ResponseEntity<OrderResponseDto> addNewOrder(@RequestBody OrderRequestDto requestDto) {
        
        OrderEntity orderEntity=OrderMapper.INSTANCE.toOrderEntity(requestDto);
        return ResponseEntity.ok().body(orderService.addNewOrder(orderEntity));
    
    }
       
    @GetMapping("/orderbyıd")
    public ResponseEntity<List<OrderResponseDetailDto>> addNewOrder(@RequestBody OrderRequestByIdDto requestDto) {
        
        return ResponseEntity.ok().body(orderService.getOrderById(requestDto));
    
    }

}
