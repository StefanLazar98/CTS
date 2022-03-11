package com.practica.classes;

import com.practica.contracts.CreateConnectionSQL;

public class CreateConnectionNoSQL implements com.practica.contracts.CreateConnectionNoSQL {
    @Override
    public MongoDatabase createConnection() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDb = mongoClient.getDatabase("test");
        return mongoClient;
    }
}
