package com.practica.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadSQL implements com.practica.contracts.ReadSQL {
    @Override
    public void read(Connection connection, String tableName) {
        try{
            String sqlSelect = "SELECT * FROM "+ tableName;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlSelect);
            while(rs.next()) {
                int id = rs.getInt("id");
                System.out.println("id: " + id);
                String name = rs.getString(2);
                System.out.println("name: " + name);
                String address = rs.getString("address");
                System.out.println("address: " + address);
                double salary = rs.getDouble("salary");
                System.out.println("salary: " + salary);
            }
            rs.close();
            statement.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
