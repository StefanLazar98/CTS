package com.practica.contracts;

import java.sql.Connection;

public interface InsertSQL {
    public void insert(Connection connection, String tableName);
}

