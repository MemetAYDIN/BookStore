package com.example.orderbookproject.dao.orderdao;

import java.io.Serializable;

public class OrderSql implements Serializable {

    public static final String ORDER_LIST_DESC_BY_USER_ID_SQL = """
                SELECT *FROM ORDERS WHERE user_id=:userId ORDERS BY updatedAt DESC

            """
            .stripIndent();
}
