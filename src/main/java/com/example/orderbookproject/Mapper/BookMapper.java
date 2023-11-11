package com.example.orderbookproject.Mapper;

import org.mapstruct.Mapper;

import com.example.orderbookproject.dto.orderdto.OrderBookDetailDto;
import com.example.orderbookproject.entity.BookEntity;

@Mapper
public interface BookMapper {
    
    
    BookEntity toBookEntity(OrderBookDetailDto orderBookDetailRequestDto);
}
