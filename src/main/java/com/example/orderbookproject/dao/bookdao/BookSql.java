package com.example.orderbookproject.dao.bookdao;

import java.io.Serializable;

public class BookSql implements Serializable {

    public static final String BOOK_LIST_SQL = """
                SELECT *FROM BOOK

            """
            .stripIndent();
}
