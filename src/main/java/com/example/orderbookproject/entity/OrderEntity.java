package com.example.orderbookproject.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "ORDERS")
@Data
public class OrderEntity implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "price", nullable = false)
    private BigDecimal totalPrice;

    @CreatedDate
    @Column(updatable = false, nullable = true)
    LocalDate createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    LocalDate updatedAt;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
    private List<BookEntity> bookList;
}
