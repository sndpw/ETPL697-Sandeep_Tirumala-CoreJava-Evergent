package com.evergent.corejava.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class CallableStatementExample4 {
    public static void main(String[] args) {
    	Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "evergentdb";
        String driverName = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        // Employee ID to search for
        int employeeId = 2;

        try{
          Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver();
          conn = DriverManager.getConnection(url+dbName, userName, password);
          try{
        
        	  String sql = "{CALL getEmployeeName(?, ?)}";
              CallableStatement callableStatement = conn.prepareCall(sql);

              // Set the input parameter (IN parameter)
              callableStatement.setInt(1, employeeId);

              // Register the output parameter (OUT parameter)
              callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);

              // Execute the stored procedure
              callableStatement.execute();

              // Retrieve the output parameter value
              String employeeName = callableStatement.getString(2);
              System.out.println("Employee Name: " + employeeName);

        } catch (SQLException e) {
            e.printStackTrace();
        }}
          catch (Exception e){
              e.printStackTrace();
            } 
        }}
