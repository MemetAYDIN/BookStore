package com.example.orderbookproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderbookproject.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    BookEntity findByIsbn(String isbn);
    
    BookEntity findByTitleAndAuthor(String title, String author);

    void deleteByIsbn(String isbn);
}
