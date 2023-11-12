package com.example.orderbookproject.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.orderbookproject.dto.orderdto.OrderBookDetailDto;
import com.example.orderbookproject.entity.BookEntity;

@Mapper
public interface BookMapper {
    
    BookMapper INSTANCE=Mappers.getMapper(BookMapper.class);
    BookEntity toBookEntity(OrderBookDetailDto orderBookDetailRequestDto);

    OrderBookDetailDto toResponseDto(BookEntity bookEntity);

    List<OrderBookDetailDto> toResponseListDto(List<BookEntity> bookEntity);
}
