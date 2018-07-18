/*
package com.softwareag.relationaldb;

import java.sql.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SqlChecker {
     public void sqlDataChecker(String externalDB,String url,String userName,String password,String[] check){

         System.out.println("Validating the data You entered ");
         //String connectionUrl = "jdbc:oracle:thin:@vmchnapi01w:1521:XE";
         */
/*String connectionUrl = "jdbc:sqlserver://vmchnapi01w:1433";*//*

            try {
                // Establish the connection.
                */
/* con = DriverManager.getConnection(connectionUrl, "DBUSER", "PASSWORD123");*//*

                Connection con = DriverManager.getConnection(url, userName, password);
                String SQL = null;
                Integer[] count = new Integer[check.length];
                for (int i = 0; i < check.length; i++) {
                    if (externalDB.equals("oracle")) {
                        SQL = "SELECT COUNT(*) AS count FROM ALL_USERS WHERE USERNAME='" + check[i] + "'";
                    } else if (externalDB.equals("MS-SQL")) {
                        SQL = "SELECT COUNT(*) AS count FROM master.dbo.sysdatabases WHERE name='" + check[i] + "'";
                    }
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(SQL);
                    while (rs.next()) {   // Move the cursor to the next row, return false if no more row
                        count[i] = rs.getInt("count");
                    }
                    if(count[i]<=0){
                        System.out.println("Problem with your entered Data" + check[i] + ". Please Provide valid data");
                    }
                }
                Arrays.stream(count).filter(c -> c <= 0).forEach(c -> {
                    System.out.println("Exiting From Relational Database Setup ...");
                    System.exit(1);
                });
            } catch (SQLException ex) {
                String message = ex.getLocalizedMessage();
                System.out.println(ex.getLocalizedMessage());
                if (message.contains("connection")) {
                    System.out.println("Could No connect to you Database . Please verify the Port or server is accesible");
                } else if (message.contains("denied")||message.contains("failed")) {
                    System.out.println("Enter Correct username and password");
                    System.exit(1);
                }
            }
        }
}
*/
