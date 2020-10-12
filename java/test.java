package com.know.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {

        // register Oracle thin driver with DriverManager service
        // It is optional for JDBC4.x version
        Class.forName("com.mysql.cj.jdbc.Driver");

        // variables
        final String url = "jdbc:mysql:///knowprogram";
        final String user = "root";
        final String password = "Password@0";

        // establish the connection
        Connection con = DriverManager.getConnection(url, user, password);

        // display status message
        if (con == null) {
            System.out.println("JDBC connection is not established");
            return;
        } else
            System.out.println("Congratulations," + " JDBC connection is established successfully.\n");

        // close JDBC connection
        con.close();

    }
}