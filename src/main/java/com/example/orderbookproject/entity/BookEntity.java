package com.example.orderbookproject.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "BOOK")
@Data
public class BookEntity {
    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "stockQuantity", nullable = false)
    private Long stockQuantity;

    @CreatedDate
    @Column(updatable = false, nullable = true)
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDate updatedAt;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderEntity order;

}
