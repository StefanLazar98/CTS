package com.practica;

import com.practica.classes.CloseConnectionSQL;
import com.practica.classes.CreateConnectionSql;
import com.practica.classes.CreateTableSQL;
import com.practica.contracts.*;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String tableName ="Employee";
        CreateConnectionSQL sqlConnection =  new CreateConnectionSql();
        Connection connection = sqlConnection.createConnection();
        CreateTableSQL createTableSQL = new CreateTableSQL();
        createTableSQL.createTable(connection,tableName);
        InsertSQL insertSQL = new com.practica.classes.InsertSQL();
        insertSQL.insert(connection,tableName);
        ReadSQL readSQL = new com.practica.classes.ReadSQL();
        readSQL.read(connection,tableName);
        new CloseConnectionSQL().close(connection);

////////////////////////////////////////////////////////////////////////////////////////////////////
        CreateConnectionNoSQL createConnectionNoSQL = new com.practica.classes.CreateConnectionNoSQL();
        MongoClient mongoClient = createConnectionNoSQL.createConnection();
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        CreateTableNoSQL createTableNoSQL = new com.practica.classes.CreateTableNoSQL();
        createTableNoSQL.createTable(mongoDatabase,tableName);
        InsertNoSQL insertNoSQL = new com.practica.classes.InsertNoSQL();
        insertNoSQL.insert(mongoDatabase,tableName);
        ReadNoSQL readNoSQL = new com.practica.classes.ReadNoSQL();
        readNoSQL.read(mongoDatabase,tableName);


    }
}
