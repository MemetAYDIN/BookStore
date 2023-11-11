package com.example.orderbookproject.dto.orderdto;

import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Setter
@Getter
@SuperBuilder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@NoArgsConstructor
public class OrderResponseDetailDto {
    private Set<OrderBookDetailDto> bookList;
    private BigDecimal totalPrice;
    private Long totalQuantity;
    private Long userId;
}
