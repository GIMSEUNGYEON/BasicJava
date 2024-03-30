package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//LPROD 테이블에 데이터 입력하기

public class JdbcTest04 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			
			System.out.println("추가할 LPROD 정보를 입력하세요");
			System.out.print("LPROD_ID >> ");
			int id = sc.nextInt();
			System.out.print("LPROD_GU >> ");
			String gu = sc.next();
			System.out.print("LPROD_NM >> ");
			String nm = sc.next();
			
//			String sql = "insert into lprod(lprod_id, lprod_gu, lprod_nm) "
//					+ " values(" + id + ", '" + gu +"', '" + nm +"')";
//			stmt = conn.createStatement();
//			//select문을 사용할때는 executeQuery문을 사용
//			//insert문을 사용할때는 executeUpdate이용
//			//executeUpdate의 반환값은 정수값
//			System.out.println(sql);
//			int cnt = stmt.executeUpdate(sql);
//			
			PreparedStatement pstmt = null;
			String sql = "insert into lprod(lprod_id, lprod_gu, lprod_nm) "
					+ " values(?, ?, ?)";
			//문자형 ?일지라도 작은 따옴표는 쓰지 않음
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, gu);
			pstmt.setString(3, nm);
			int cnt = pstmt.executeUpdate();
			
			System.out.println("반환된 cnt ==> " + cnt);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null) try {rs.close();} catch (SQLException e) {}
			if (stmt != null) try {stmt.close();} catch (SQLException e) {}
			if (conn != null) try {conn.close();} catch (SQLException e) {}
		}
	}
}
