package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_ConnectionDemo_Array {
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
				String query = "insert into employee values (?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(query);

				Object[][] data = {
						{101, "Sandeep", 27000.0f},
						{102, "Ravi", 28000.0f},
						{103, "Varun", 25000.0f},
						{104, "Teja", 26000.0f},
				};
				
				for(Object[] row : data) {
					pstmt.setInt(1,(int) row[0]);
					pstmt.setString(2, (String) row[1]);
					pstmt.setFloat(3, (float) row[2]);
					pstmt.addBatch();
				}
				
				int[] i = pstmt.executeBatch();
				System.out.println(i.length + "rows effected");
				System.out.println();
				ResultSet rs = pstmt.executeQuery("Select * from employee");
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
