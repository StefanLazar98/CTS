package com.practica.classes;

public class CloseConnectionNoSQL implements com.practica.contracts.CloseConnectionNoSQL {
    @Override
    public void close(MongoClient mongoClient) {
        mongoClient.close();
    }
}
