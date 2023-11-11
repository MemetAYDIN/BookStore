package com.example.orderbookproject.dao.orderdao;

import java.io.Serializable;

public class OrderSql implements Serializable {

    public static final String ORDER_LIST_DESC_BY_UPDATE_DATE_SQL = """
                SELECT *FROM ORDERS WHERE order_id=:orderId ORDERS BY updatedAt DESC

            """
            .stripIndent();
}
