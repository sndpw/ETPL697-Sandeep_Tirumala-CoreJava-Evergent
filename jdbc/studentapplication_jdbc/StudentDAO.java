package com.evergent.coreJAVA.studentapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	public static int addStudent(StudentBean studentBean) {
		int r = 0;
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
				String query = "insert into stdDao values (?, ?, ?, ?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(query);

				int id = studentBean.getStudentId();
				String name = studentBean.getName();
				String course = studentBean.getCourse();
				float test1 = studentBean.getTest1();
				float test2 = studentBean.getTest2();
				String grade = studentBean.getGrade();

				Object[][] data = { { id, name, course, test1, test2, grade }, };

				for (Object[] row : data) {
					pstmt.setInt(1, (int) row[0]);
					pstmt.setString(2, (String) row[1]);
					pstmt.setString(3, (String) row[2]);
					pstmt.setFloat(4, (float) row[3]);
					pstmt.setFloat(5, (float) row[4]);
					pstmt.setString(6, (String) row[5]);

					pstmt.addBatch();
				}

				int[] i = pstmt.executeBatch();
				System.out.println(i.length + "rows effected");
				r = i.length;
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
		return r;
	}

}
