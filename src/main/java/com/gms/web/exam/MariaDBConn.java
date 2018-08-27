package com.gms.web.exam;

import java.sql.*;

public class MariaDBConn {
	public String exam() {
		Connection conn;
		Statement stmt;
		String s = "";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager .getConnection(
					"jdbc:mariadb://localhost:3306/mariadb", 
					"mariadb", 
					"mariadb");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBER");
			if(rs.next()) {
				s = rs.getString("MEMBERID");
			}else {
				s = "접속 실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		
	}
}
