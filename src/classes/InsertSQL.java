package com.practica.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSQL implements com.practica.contracts.InsertSQL {
    @Override
    public void insert(Connection connection, String tableName) {
        try{
            String sqlInsert = "INSERT INTO"+tableName+" VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlInsert);
            statement.close();

            String sqlInsertWithParams = "INSERT INTO"+tableName+" VALUES VALUES (?,?,?,?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sqlInsertWithParams);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Ionescu Vasile");
            preparedStatement.setString(3, "Brasov");
            preparedStatement.setDouble(4, 4500);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
