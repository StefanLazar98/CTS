package com.practica.contracts;

public interface CreateTableNoSQL {
    public void createTable(MongoDatabase mongoDb, String tableName);
}
