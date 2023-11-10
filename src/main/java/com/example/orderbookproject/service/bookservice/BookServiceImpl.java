package com.example.orderbookproject.service.bookservice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.orderbookproject.dao.bookdao.BookDao;
import com.example.orderbookproject.dto.bookdto.AddNewBookRequestDto;
import com.example.orderbookproject.dto.bookdto.AddNewBookResponseDto;
import com.example.orderbookproject.dto.bookdto.BookIsbnRequestDto;
import com.example.orderbookproject.dto.bookdto.BookListResponse;
import com.example.orderbookproject.dto.bookdto.DeleteBookRequest;
import com.example.orderbookproject.dto.bookdto.DeleteBookResponse;
import com.example.orderbookproject.dto.userdto.RoleType;
import com.example.orderbookproject.entity.BookEntity;
import com.example.orderbookproject.exception.BusinessException;
import com.example.orderbookproject.repository.BookRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookDao bookDao;

    @Override
    public List<BookListResponse> getBooksList() {
        List<BookListResponse> bookList = getBookList();
        if (bookList.equals(null)) {
            throw new BusinessException("BookList is Empty");
        }
        return bookList;
    }

    private List<BookListResponse> getBookList() {
        List<BookEntity> bookList = bookRepository.findAll();
        if (!CollectionUtils.isEmpty(bookList)) {
            return (List<BookListResponse>) bookList.stream().map(entity -> BookListResponse.builder()
                    .author(entity.getAuthor())
                    .isbn(entity.getIsbn())
                    .price(entity.getPrice())
                    .stockQuantity(entity.getStockQuantity())
                    .title(entity.getTitle())
                    .build())
                    .toList();
        }
        return Collections.emptyList();
    }

    @Override
    public BookListResponse getBooksByIsbn(@Valid BookIsbnRequestDto requestDto) {

        BookListResponse bookIsbnResonse = getBookByIsbn(requestDto);
        return bookIsbnResonse;
    }

    private BookListResponse getBookByIsbn(BookIsbnRequestDto requestDto) {
        BookEntity bookByIsb = bookRepository.findByIsbn(requestDto.getIsbn());
        BookListResponse bookResponse = new BookListResponse();
        if (!bookByIsb.equals(null)) {

            bookResponse.setAuthor(bookByIsb.getAuthor());
            bookResponse.setIsbn(bookByIsb.getIsbn());
            bookResponse.setPrice(bookByIsb.getPrice());
            bookResponse.setStockQuantity(bookByIsb.getStockQuantity());
            bookResponse.setTitle(bookByIsb.getTitle());
        } else {
            throw new BusinessException("BOOK NOT FOUND BY ISBN");
        }
        return bookResponse;
    }

    @Override
    public AddNewBookResponseDto addNewBook(@Valid AddNewBookRequestDto requestDto) {
        AddNewBookResponseDto response = new AddNewBookResponseDto();
        if (requestDto.getRole().equals(RoleType.ADMIN)) {
            BookEntity bookEntity = addNewBookAttribute(requestDto);
            bookRepository.save(bookEntity);
            response.setMessage("Book registered");
        } else {
            response.setMessage("Role don't have permission");
            throw new BusinessException("Role don't have permission");
        }

        return response;
    }

    public BookEntity addNewBookAttribute(AddNewBookRequestDto requestDto) {
        BookEntity entity = new BookEntity();
        entity.setAuthor(requestDto.getAuthor());
        entity.setBookId(requestDto.getBookId());
        entity.setCreatedAt(LocalDate.now());
        entity.setIsbn(requestDto.getIsbn());
        entity.setPrice(requestDto.getPrice());
        entity.setStockQuantity(requestDto.getStockQuantity());
        entity.setTitle(requestDto.getTitle());
        entity.setUpdatedAt(LocalDate.now());

        return entity;
    }

    @Override
    public AddNewBookResponseDto updateBook(@Valid AddNewBookRequestDto requestDto) {
        AddNewBookResponseDto response = new AddNewBookResponseDto();
        if (requestDto.getRole().equals(RoleType.ADMIN)) {
            BookEntity bookEntity = bookRepository.findByIsbn(requestDto.getIsbn());
            bookRepository.save(bookEntity);
            response.setMessage("Book Updated");
        } else {
            response.setMessage("Role don't have UPDATE permission");
            throw new BusinessException("Role don't UPDATE have permission");
        }

        return response;
    }

    @Override
    public DeleteBookResponse deleteBook(@Valid DeleteBookRequest requestDto) {
        BookEntity bookEntity = bookRepository.findByIsbn(requestDto.getIsbn());
        DeleteBookResponse dResponse = new DeleteBookResponse();
        if (!bookEntity.equals(null)) {
            bookRepository.deleteByIsbn(requestDto.getIsbn());
            dResponse.setMessage("BOOK DELETED");
        } else {
            throw new BusinessException("BOOK DID NOT FOUND");
        }

        return dResponse;
    }
}
