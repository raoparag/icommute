package com.iCommute.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDao {

	String sql = "select * from test";

	public void testConnection() throws ClassNotFoundException {
		Connection conn = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
				"jdbc:mysql://10.156.160.240:3306/icommute","icommute_user","icommute_user");
			
			PreparedStatement ps = conn.prepareStatement(sql);
			if (ps.execute()) {
				System.out.println("fine");

			} else {
				System.out.println("something bad");
			}
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

}
