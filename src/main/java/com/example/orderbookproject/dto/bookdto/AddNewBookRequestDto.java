package com.example.orderbookproject.dto.bookdto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
public class AddNewBookRequestDto {

    private Long bookId;
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
    private Long stockQuantity;
    private String role;
}
