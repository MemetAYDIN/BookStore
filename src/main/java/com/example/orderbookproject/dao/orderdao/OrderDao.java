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

    public OrderEntity getOrderById(Long orderId) {
        Query query = getEntityManager().createNativeQuery(OrderSql.ORDER_LIST_DESC_BY_UPDATE_DATE_SQL, BookEntity.class)
        .setParameter("orderId", orderId);

        return  (OrderEntity) query.getSingleResult();
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
