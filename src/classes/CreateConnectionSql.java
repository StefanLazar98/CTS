package com.practica.classes;

import com.practica.contracts.CreateConnectionSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnectionSql implements CreateConnectionSQL {
    @Override
    public Connection createConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);
            return connection;
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
