package com.practica.classes;

public class InsertNoSQL implements com.practica.contracts.InsertNoSQL {
    @Override
    public void insert(MongoDatabase mongoDb, String tableName) {

        Document employee1 = new Document().append("name", "Popescu Ion").
                append("address", "Bucharest").append("salary", 4000);

        MongoCollection<Document> collection = mongoDb.getCollection(tableName);
        collection.insertOne(employee1);

        Document employee2 = new Document().append("name", "Ionescu Vasile").
                append("salary", 4500);
        collection.insertOne(employee2);
    }
}
