package com.ftp.coding.challenge;

import com.ftp.coding.challenge.connector.DBConnector;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBConnectorTest {

    @Test
    public void testDBConnector() throws SQLException {
        Connection dbConnection = null;
        try {
            dbConnection = new DBConnector("jdbc:mysql://localhost/testdb?" +
                    "user=root&password=root").getConnection();
        } catch (Exception e) {
            assertEquals("Database connection error 0", e.getMessage());
        }

        /** We expect null schema value due to database error connection */
        assertEquals(null, dbConnection);
    }
}
