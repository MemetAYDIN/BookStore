package com.example.orderbookproject.dao.orderdao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.orderbookproject.entity.BookEntity;
import com.example.orderbookproject.entity.OrderEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class OrderDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<OrderEntity> getOrderByUserId(Long userId) {
        Query query = getEntityManager().createNativeQuery(OrderSql.ORDER_LIST_DESC_BY_USER_ID_SQL, BookEntity.class)
        .setParameter("userId", userId);

        return  query.getResultList();
    }

    /*
     * public List<UserEntity> getEmailCount(String email) {
     * Query query = getEntityManager()
     * .createNativeQuery(UserSql.COUNT_USER_SQL, UserEntity.class)
     * .setParameter("email", email);
     * return (List<UserEntity>) query.getResultList();
     * }
     */
}
