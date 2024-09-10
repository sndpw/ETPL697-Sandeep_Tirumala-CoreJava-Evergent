package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_ConnectionDemo1 {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "evergentdb";
		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "admin";
		try {
			Class.forName(driverName); // Loading the Driver , Driver d1=new Driver()
			conn = DriverManager.getConnection(url + dbName, userName, password);
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from employee");
//				String query = "create table hameed(id int, name varchar(10))";
//				PreparedStatement pstmt = conn.prepareStatement(query);
//				int i = pstmt.executeUpdate();
				while (rs.next()) {
					System.out.println("Employee No :" + rs.getInt(1));
					System.out.println("Employee Name :" + rs.getString(2));
					System.out.println("Employee sal :" + rs.getFloat(3));
				}
			} catch (SQLException s) {
				System.out.println(s);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
