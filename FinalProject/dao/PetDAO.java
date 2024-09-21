package com.evergent.coreJAVA.sandeep.FinalProject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PetDAO {

	private static double finalCost = 0;

	public static int addPet(com.evergent.coreJAVA.sandeep.FinalProject.bean.Pet p) {
		Connection conn = null;

		try {
			conn = PetDB.getConnection();
			try {
				String query = "insert into petDAO values (?, ?, ?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(query);

				String area = p.getArea();
				String breed = p.getBreed();
				int quantity = p.getQuantity();
				double price = p.getPrice();
				double totalCost = p.getTotalCost();

				setFinalCost(getFinalCost() + totalCost);

				pstmt.setString(1, area);
				pstmt.setString(2, breed);
				pstmt.setInt(3, quantity);
				pstmt.setDouble(4, price);
				pstmt.setDouble(5, totalCost);

				pstmt.addBatch();

				int i = pstmt.executeUpdate();
				return i;
			} catch (SQLException s) {
				System.out.println(s);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList getDetails() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = PetDB.getConnection();
		String sel_str = "Select * from petDAO";
		pstmt = con.prepareStatement(sel_str);
		rs = pstmt.executeQuery();

		ArrayList result = new ArrayList();

		while (rs.next()) {
			String s1 = rs.getString(1);
			String s2 = rs.getString(2);
			int s3 = rs.getInt(3);
			double s4 = rs.getDouble("Price");
			double s5 = rs.getDouble("FinalPrice");
			String s6 = s2 + " - Quantity: " + s3 + ", Cost: RS." + s5;
			result.add(s6);
		}
		return result;
	}

	public static double getFinalCost() {
		return finalCost;
	}

	public static void setFinalCost(double finalCost) {
		PetDAO.finalCost = finalCost;
	}

}
