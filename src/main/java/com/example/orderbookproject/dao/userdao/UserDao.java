package com.example.orderbookproject.dao.userdao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.orderbookproject.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserEntity> getMatchNameAndPassword(String email, String password) {
        Query query = getEntityManager()
                .createNativeQuery(UserSql.MATCH_USER_PASSWORD_AND_EMAIL_SQL, UserEntity.class)
                .setParameter("email", email)
                .setParameter("password", password);
        return (List<UserEntity>) query.getResultList();
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
