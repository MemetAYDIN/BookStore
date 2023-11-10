package com.example.orderbookproject.dao.userdao;

import java.io.Serializable;

public class UserSql implements Serializable {

    public static final String MATCH_USER_PASSWORD_AND_EMAIL_SQL = """
                SELECT *FROM USERS WHERE email=:email and password=:password

            """
            .stripIndent();

    // public static final String COUNT_USER_SQL = """
    // SELECT COUNT(email) as email_couunt FROM USERS WHERE email=:email
    //
    // """
    // .stripIndent();

}
