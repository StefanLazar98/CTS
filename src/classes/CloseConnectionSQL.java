package com.practica.classes;

import java.sql.Connection;

public class CloseConnectionSQL implements com.practica.contracts.CloseConnectionSQL {
    @Override
    public void close(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
