package com.example.orderbookproject.dto.bookdto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
public class DeleteBookRequest {
    private String isbn;
}
