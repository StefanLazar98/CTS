package com.practica.classes;

public class ReadNoSQL implements com.practica.contracts.ReadNoSQL {
    @Override
    public void read(MongoDatabase mongoDb, String tableName) {
        MongoCollection<Document> collection = mongoDb.getCollection(tableName);
        FindIterable<Document> result = collection.find();
        for (Document doc : result) {
            System.out.println(doc);
        }
    }
}
