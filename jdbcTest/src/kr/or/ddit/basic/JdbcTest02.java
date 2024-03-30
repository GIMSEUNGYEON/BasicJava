package kr.or.ddit.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//문제 : 사용자로부터 Lpro_id값을 입력 받아 입력한 값보다 lprod_id가 큰 자료들을 출력하시오.

public class JdbcTest02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			String sql = "select * from lprod where lprod_id > " + i;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println(">쿼리문 실행 결과<");

			while (rs.next()) {
				System.out.printf("LPROD_ID : %d\t",rs.getInt(1));
				System.out.printf("LPROD_GU : %s\t", rs.getString(2));
				System.out.printf("LPROD_NM : %s\n", rs.getString(3));
				System.out.println("-----------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch (SQLException e) {}
			if (stmt != null) try {stmt.close();} catch (SQLException e) {}
			if (conn != null) try {conn.close();} catch (SQLException e) {}
		
		}
	}
}
