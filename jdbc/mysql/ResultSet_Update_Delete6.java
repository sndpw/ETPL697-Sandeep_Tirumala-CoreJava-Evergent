 //mysql>create table employee8(no integer primary key ,ename varchar(20),sal float(8,2));
//mysql> insert into employee8 values(101,'raj1',10000);

package com.evergent.corejava.jdbc.mysql;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet_Update_Delete6 {
  public static void main(String[] args) {
     Connection conn = null;
      String url = "jdbc:mysql://localhost:3306/";
      String dbName = "evergentdb";
      String driverName = "com.mysql.jdbc.Driver";
      String userName = "root";
      String password = "root";
      try{
        Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver();
        conn = DriverManager.getConnection(url+dbName, userName, password);
        try{
          //Statement stmt = conn.createStatement(); 
          // Create a statement with updateable result set
          Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
        		                                            ResultSet.CONCUR_UPDATABLE);
          ResultSet rs=stmt.executeQuery("Select * from employee8");
              while(rs.next()){
        	 System.out.println("Employee No :" + rs.getInt(1));
             System.out.println("Employee Name :" + rs.getString(2));
        	    	System.out.println("Employee sal :"+rs.getInt(3));
          }       
              
              // Move to the first row and update data
              if (rs.first()) {
                  rs.updateString("ename", "Hello");
                  rs.updateRow(); // Commit the update
                  System.out.println("Row updated successfully.");
              }
           // Move to the second row and delete it
              if (rs.absolute(2)) {
                  rs.deleteRow(); // Delete the current row
                  System.out.println("Row deleted successfully.");
              }
        }
        catch(SQLException s){
          System.out.println(s);
        }
        conn.close();
      }
      catch (Exception e){
        e.printStackTrace();
      }  }}

