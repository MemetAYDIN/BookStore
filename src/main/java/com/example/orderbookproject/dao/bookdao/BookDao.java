package com.example.orderbookproject.dao.bookdao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.orderbookproject.entity.BookEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<BookEntity> getByTitleAndAuthor(String title,String author) {
        Query query = getEntityManager().createNativeQuery(BookSql.BOOK_LIST_SQL, BookEntity.class)
        .setParameter("title",title)
        .setParameter("author", author);

        return query.getResultList();
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
