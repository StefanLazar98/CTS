package com.practica.contracts;

import java.sql.Connection;

public interface ReadSQL {
    public void read(Connection connection, String tableName);
}
