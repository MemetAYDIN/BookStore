package com.example.orderbookproject.service.bookservice;

import java.util.List;

import com.example.orderbookproject.dto.bookdto.AddNewBookRequestDto;
import com.example.orderbookproject.dto.bookdto.AddNewBookResponseDto;
import com.example.orderbookproject.dto.bookdto.BookIsbnRequestDto;
import com.example.orderbookproject.dto.bookdto.BookListResponse;
import com.example.orderbookproject.dto.bookdto.DeleteBookRequest;
import com.example.orderbookproject.dto.bookdto.DeleteBookResponse;

import jakarta.validation.Valid;

public interface BookService {

    public List<BookListResponse> getBooksList();

    public BookListResponse getBooksByIsbn(@Valid BookIsbnRequestDto isbn);

    public AddNewBookResponseDto addNewBook(@Valid AddNewBookRequestDto requestDto);

    // add dto larının kullandığı data ları kullanıp günselleme işlemini yaptım
    public AddNewBookResponseDto updateBook(@Valid AddNewBookRequestDto requestDto);

    public DeleteBookResponse deleteBook(@Valid DeleteBookRequest requestDto);
}
