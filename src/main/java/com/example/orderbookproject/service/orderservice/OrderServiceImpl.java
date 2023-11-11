package com.example.orderbookproject.service.orderservice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbookproject.Mapper.OrderMapper;
import com.example.orderbookproject.dao.orderdao.OrderDao;
import com.example.orderbookproject.dto.orderdto.OrderRequestByIdDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDetailDto;
import com.example.orderbookproject.dto.orderdto.OrderResponseDto;
import com.example.orderbookproject.entity.OrderEntity;
import com.example.orderbookproject.exception.BusinessException;
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
    private final OrderDao orderDao;

    @Override
    public OrderResponseDto addNewOrder(OrderEntity entity) {
        BigDecimal price25 = new BigDecimal(25);
        int comparisonResult =entity.getTotalPrice().compareTo(price25);

        OrderResponseDto responseDto=new OrderResponseDto();

        if (comparisonResult> 0) {
        entity.setCreatedAt(LocalDate.now());
        entity.setUpdatedAt(LocalDate.now());
           orderRepository.save(entity);
           responseDto.setMessage("Oder has been taken");
        }else{
            responseDto.setMessage("Price under 25$");
            throw new BusinessException("Price under 25$");
        }

        return responseDto;
    }

    @Override
    public OrderResponseDetailDto getOrderById(OrderRequestByIdDto requestDto) {

        OrderEntity entity=orderDao.getOrderById(requestDto.getOrderId());
        OrderResponseDetailDto detailDto=OrderMapper.INSTANCE.toOrderResponse(entity);
        return detailDto;
    }

}
