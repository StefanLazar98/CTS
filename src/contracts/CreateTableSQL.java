package com.practica.contracts;

import java.sql.Connection;

public interface CreateTableSQL {
    public void createTable(Connection connection, String tableName);
}
