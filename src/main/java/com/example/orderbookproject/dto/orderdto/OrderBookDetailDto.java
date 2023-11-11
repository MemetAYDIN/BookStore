package com.example.orderbookproject.dto.orderdto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import jakarta.persistence.Column;
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
public class OrderBookDetailDto {
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
    private Long stockQuantity;
}
