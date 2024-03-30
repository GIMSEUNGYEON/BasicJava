package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.net.aso.p;

public class JdbcTest03 {
	public static void main(String[] args) {
		// ���� : ����ڷκ��� Lprod_id ���� �ΰ� �Է¹޾Ƽ� �� �� ���� �ڷ���� ���
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		int i = sc.nextInt();		
		System.out.println("�ι�° ���� �Է� : ");
		int ii = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			
//			if(i > ii) {
//				int temp = i;
//				i = ii;
//				ii = temp;
//			}
//			
			int max, min;
			max = i > ii ? i : ii; //i�� �� ũ�� max = i, ii�� �� ũ�� max = ii;
			min = i < ii ? i : ii;
			System.out.println(max);
			System.out.println(min);
//			int max2 = Math.max(i, ii);
//			int min2 = Math.min(i, ii);
			//���� ũ�ų� ���� ���� ã�� �޼ҵ�
			
			//Statement ��ü�� �̿��� ó��
//			String sql = "select lprod_id �з���ȣ, lprod_gu �з��ڵ�, lprod_nm �з���  from lprod where lprod_id between "+ i + " and " + ii;
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
			//PreparedStatement ��ü�� �̿��غ���
			//SQL���� �ۼ��� �� �����Ͱ� �� �ڸ��� ����ǥ�� ǥ���ؼ� �ۼ��Ѵ�
			String sql = "select lprod_id �з���ȣ, lprod_gu �з��ڵ�, lprod_nm �з���  from lprod where lprod_id between ? and ?" ;
			//PreparedStatement ��ü ���� ==> ����� sql �������� �Ű������� �����Ͽ� �ۼ��Ѵ�
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(sql);
			//����ǥ �ڸ��� �� �����͸� �����Ѵ�.
			//���� : PreparedStatement��ü.set�ڷ����̸�(����ǥ��ȣ, ������ �����Ͱ�);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			//�����ͼ����� �Ϸ�Ǹ� sql�� ����
			rs = pstmt.executeQuery();
			System.out.println(" == ������ ���� ���  ==");
			System.out.println("�з���ȣ\t�з��ڵ�\t�з���");
			while(rs.next()) {
				System.out.printf("    %d\t%s\t%s\n", rs.getInt("�з���ȣ"), rs.getString(2), rs.getString("�з���"));
				//�Ӽ��� ������ �ο��� ��쿣 �÷����� �� �� ���� ������ ������ ����Ѵ�.
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null) try {rs.close();} catch (SQLException e) {}
			if (stmt != null) try {stmt.close();} catch (SQLException e) {}
			if (conn != null) try {conn.close();} catch (SQLException e) {}
		}
		
	}
}
