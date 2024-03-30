package kr.or.ddit.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//���� : ����ڷκ��� Lpro_id���� �Է� �޾� �Է��� ������ lprod_id�� ū �ڷ���� ����Ͻÿ�.

public class JdbcTest02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int i = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			String sql = "select * from lprod where lprod_id > " + i;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println(">������ ���� ���<");

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
