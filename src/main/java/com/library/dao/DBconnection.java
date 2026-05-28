package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {
	
static Connection conn;

public static Connection getConnection() {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect database

	       String url="jdbc:mysql://localhost:3306/librarydb";
	       String user="root";
	       String pass="Tiger@123";
	       Connection connection=DriverManager.getConnection(url, user, pass);
	       return connection;  

    } catch(Exception e) {

        // Print error
        e.printStackTrace();
        return null;
    }
  
}
}
