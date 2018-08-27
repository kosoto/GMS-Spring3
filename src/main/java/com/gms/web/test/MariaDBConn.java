package com.gms.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.gms.web.domain.MemberDTO;

public class MariaDBConn {
	public String exam() {
		Connection conn;
		Statement stmt;
		List<MemberDTO> list = null;
		MemberDTO m = null;
		String s = "";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager .getConnection(
					"jdbc:mariadb://localhost:3306/mariadb", 
					"mariadb", 
					"mariadb");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBER WHERE MEMBER_ID LIKE 'C5'");
			while(rs.next()) {
				/*m = new MemberDTO();
				m.setAge(rs.getString("AGE"));
				m.setGender(rs.getString("GENDER"));
				m.setMemberId(rs.getString("MEMBER_ID"));
				m.setName(rs.getString("NAME"));
				m.setPass(rs.getString("PASS"));
				m.setRoll(rs.getString("ROLL"));
				m.setSsn(rs.getString("SSN"));
				m.setTeamId(rs.getString("TEAM_ID"));
				list.add(m);*/
				s = rs.getString("NAME");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		
	}
}
