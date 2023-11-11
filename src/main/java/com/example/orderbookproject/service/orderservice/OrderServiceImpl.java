package com.example.orderbookproject.service.orderservice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbookproject.dto.orderdto.OrderResponseDto;
import com.example.orderbookproject.entity.OrderEntity;
import com.example.orderbookproject.repository.BookRepository;
import com.example.orderbookproject.repository.OrderRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final BookRepository bookRepository;

    @Override
    public OrderResponseDto addNewOrder(OrderEntity entity) {
        BigDecimal big25 = new BigDecimal(25);
        int comparisonResult =entity.getTotalPrice().compareTo(big25);

        if (comparisonResult> 0) {
        entity.setCreatedAt(LocalDate.now());
        entity.setUpdatedAt(LocalDate.now());
           orderRepository.save(entity);
        }

        return new OrderResponseDto();
    }

}
