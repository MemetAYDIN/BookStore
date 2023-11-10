package com.example.orderbookproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbookproject.dto.bookdto.AddNewBookRequestDto;
import com.example.orderbookproject.dto.bookdto.AddNewBookResponseDto;
import com.example.orderbookproject.dto.bookdto.BookIsbnRequestDto;
import com.example.orderbookproject.dto.bookdto.BookListResponse;
import com.example.orderbookproject.dto.bookdto.DeleteBookRequest;
import com.example.orderbookproject.dto.bookdto.DeleteBookResponse;
import com.example.orderbookproject.service.bookservice.BookService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/bookslist")
    public ResponseEntity<List<BookListResponse>> getAllBooks() {
        return ResponseEntity.ok().body(bookService.getBooksList());
    }

    @GetMapping(value = "/bookbyisbn")
    public ResponseEntity<BookListResponse> getBooksByIsbn(@RequestBody BookIsbnRequestDto requestDto) {
        return ResponseEntity.ok().body(bookService.getBooksByIsbn(requestDto));
    }

    @PostMapping("/newbook")
    public ResponseEntity<AddNewBookResponseDto> addNewbook(@RequestBody AddNewBookRequestDto requestDto) {
        return ResponseEntity.ok().body(bookService.addNewBook(requestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<AddNewBookResponseDto> updateBook(@RequestBody AddNewBookRequestDto requestDto) {
        return ResponseEntity.ok().body(bookService.updateBook(requestDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DeleteBookResponse> deleteBook(@RequestBody DeleteBookRequest requestDto) {
        return ResponseEntity.ok().body(bookService.deleteBook(requestDto));
    }
    /*
     * @PostMapping("/signup")
     * public ResponseEntity<SignUpResponseDto> signUp(@RequestBody SignUpRequestDto
     * requestDto) {
     * return ResponseEntity.ok().body(userService.signUp(requestDto));
     * }
     */

}
