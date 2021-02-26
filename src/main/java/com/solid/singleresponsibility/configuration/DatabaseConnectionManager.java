package com.solid.singleresponsibility.configuration;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class DatabaseConnectionManager {
    private Connection connection;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();


    public DatabaseConnectionManager () {}

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Some/Database/URL");
        log.info("Established Database Connection...");
    }

    public Connection getConnectionObject() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        log.info("Disconnected from Database...");
    }
}
