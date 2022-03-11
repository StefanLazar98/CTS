package com.practica.contracts;

public interface ReadNoSQL {
    public void read(MongoDatabase mongoDb, String tableName);
}
