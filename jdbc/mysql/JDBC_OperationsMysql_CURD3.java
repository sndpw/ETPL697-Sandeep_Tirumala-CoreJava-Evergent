package com.evergent.corejava.jdbc.mysql;

/*
create database  evergentdb;
use evergentdb;
create table emp1(eno integer,ename varchar(20),sal float(8,2));

*/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_OperationsMysql_CURD3 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String username = "root";
		String password = "root";
		String dbName = "evergentdb";
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url + dbName, username, password);

			while (flag) {
				System.out.println("1.Insert\n2.Print Table\n3.Delete Record\n9.Exit\n\tEnter Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					String query = "insert into emp1 values(?,?,?)";
					// PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
					PreparedStatement pstmt = con.prepareStatement(query);
					System.out.println("Enter Employee ID: ");
					int emp = sc.nextInt();
					System.out.println("Enter Name: ");
					String ename = sc.next();
					System.out.println("Enter Salary:");
					float sal = sc.nextFloat();
					pstmt.setInt(1, emp);
					pstmt.setString(2, ename);
					pstmt.setFloat(3, sal);
					int i = pstmt.executeUpdate();
					System.out.println(i + " row inserted");
					System.out.println("\n\n");

					break;
				case 2:
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("Select * from emp1");
					while (rs.next()) {
						System.out.print("\nEmployee No. :" + rs.getInt(1));
						System.out.print("\t\tName:" + rs.getString(2));
						System.out.print("\tSal :" + rs.getFloat(3));
					}
					System.out.println("\n\n");
					break;
				case 3:
					//
					String query1 = "delete from emp1 where eno = ?";
					// PreparedStatement pstmt1=(PreparedStatement)con.prepareStatement(query1);
					PreparedStatement pstmt1 = con.prepareStatement(query1);
					System.out.println("Enter Employee ID for Delete Record: ");
					int temp = sc.nextInt();
					pstmt1.setInt(1, temp);
					int a = pstmt1.executeUpdate();
					System.out.println(a + " row deleted");
					break;
				case 4:
					query = "update student set sname = ? where sid = ?";
					PreparedStatement pstmt2 = con.prepareStatement(query);
					System.out.println("Enter sid where to be updated: ");
					int id = sc.nextInt();
					pstmt2.setInt(2, id);
					System.out.println("Enter updated name: ");
					String sName = sc.next();
					pstmt2.setString(1, sName);
					i = pstmt2.executeUpdate();
					System.out.println(i + " rows Updated");
					break;
				case 5:
					flag = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
