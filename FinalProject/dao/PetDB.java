package com.evergent.coreJAVA.sandeep.FinalProject.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PetDB {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evergentDB", "root", "admin");
		return conn;
	}
}
