package com.sathish.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	 public static Connection getConnection() throws Exception{
	        Class.forName("com.mysql.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/student";
	        Connection con = DriverManager.getConnection(url,"root" ,"password");
	        return con;
	    }
}
