package com.practica.contracts;

import java.sql.Connection;

public interface CloseConnectionSQL {
    public void close(Connection connection);
}
