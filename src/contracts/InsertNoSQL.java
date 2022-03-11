package com.practica.contracts;

public interface InsertNoSQL {
    public void insert(MongoDatabase mongoDb, String tableName);
}
