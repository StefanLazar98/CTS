package com.practica.classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableSQL implements com.practica.contracts.CreateTableSQL {
    @Override
    public void createTable(Connection connection, String tableName) {
        try {
            String sqlDrop = "DROP TABLE IF EXISTS "+tableName;
            String sqlCreate = "CREATE TABLE "+tableName +"(id INTEGER PRIMARY KEY,"
                    + "name TEXT, address TEXT, salary REAL)";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDrop);
            statement.executeUpdate(sqlCreate);
            statement.close();
            connection.commit();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
