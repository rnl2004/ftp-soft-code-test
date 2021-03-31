package com.ftp.coding.challenge.connector;

import com.ftp.coding.challenge.exception.DBConnectorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnector {
    private static final Logger logger = Logger.getLogger("DBConnection");
    Connection conn = null;
    String strConn;

    public DBConnector(String strConn) {
        this.strConn = strConn;
    }

    /** Getting a connection from database */
    public Connection getConnection() {
        String message = "";
        try {
            conn = DriverManager.getConnection(this.strConn);
        } catch (SQLException e) {
            message = "Database connection error " + e.getErrorCode();
            logger.warning(message);
            throw new DBConnectorException(message);
        }
        return null;
    }
}
