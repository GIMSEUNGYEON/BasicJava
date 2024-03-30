package kr.or.ddit.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//JDBC(Java DataBase Connectivity) ���̺귯���� �̿��� DB �ڷḦ ó���ϴ� ����
public class jdbcTest01 {
		/*DBó�� ����
		 * 1. ����̹� �ε� ==> ���̺귯���� �̿��� �� �ְ� �޸𸮷� �о���̴� �۾�
		 * ==> JDBC ���� 4.0 �̻󿡼��� getConnection()�޼��忡�� �ڵ����� �ε� ���ش�.
		 * �׷��� ���� �����ϴ�.(�������� �ʰ� ����� ����)
		 * �ǹ����� ���α׷����ϴ� ���� �ֽ� ������ �ƴ� ���� ���������� �۾��ϰ� �ȴ�.
		 * Class.forName("oracle.jdbc.driver.OracleDriver);
		 *
		 *2. DB �ý��ۿ� �����ϱ� ==> ������ �Ϸ�Ǹ� Connection ��ü�� ��ȯ�ȴ�.
		 *	DriverManager.getConnection()�޼ҵ带 �̿��Ѵ�.
		 *
		 *3. ���� �۾� ==>SQL ���� ������ ���� DB ������ ������ ����� ���´�.
		 *(Statement��ü �Ǵ� PrepareStatement ��ü�� �̿��Ͽ� �۾��Ѵ�.
		 *
		 *4. ��� ó�� �۾�
		 *	1)SQL ���� select�� �ϰ�� select�� ����� ResultSet��ü�� ����Ǿ� ��ȯ�ȴ�.
		 *	2)insert, delete, update�� ���� ��� : �������� ��ȯ��
		 *	    �� ���� ���� ���࿡ ���� ���� ���� ������ �ǹ�.
		 *
		 * 5. ����� �ڿ��� �ݳ��Ѵ�. ==> �� ��ü�� close()�޼��带 �̿��Ѵ�.
		 * 
		 */
	public static void main(String[] args) {
		//DB �۾��� �ʿ��� ���� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			
			//3. ����
			//3-1. SQL������ �ۼ�
			String sql = "select * from lprod";
			//3-2. Statement ��ü ���� ==> ���Ǹ� ó���ϴ� ��ü
			stmt = conn.createStatement();
			
			//3-3. DB ������ �����ϰ� DB ������ ó���� ����� ���´�.
			//	   (������ ������ �������� select���̱� ������ ResultSet�� ����ȴ�.
			rs = stmt.executeQuery(sql);
			
			//4. ��� ó���ϱ� ==> �� ���ڵ徿 ȭ�鿡 ����ϱ�
			//ResultSet�� ����� �����͸� ���ʷ� ���������� �ݺ����� next()���� ����ؼ� ó���Ѵ�.
			System.out.println(" == ������ ó�� ���  == ");
			//rs.next : rs��ü�� �����͸� ����Ű�� �����͸� ������° ���ڵ���ġ�� �̵���Ű�� �� ���� �����Ͱ� ������ true, ������ false�� ��ȯ�Ѵ�.
			//�����ʹ� ù��° �����͸� ����Ű�� ���� �ƴ� �ٷ� ���� ����Ű�� �ִٰ� rs.next�� �����Ű�� ù��° ���ڵ�� �̵��Ͽ� ������ ���θ� �Ǻ��ϰ� while �ݺ����� ������ �����Ѵ�.
			// rs.next�� �����ų ������ �����Ͱ� ���� �����ͷ� �̵��ϸ� ������ �����ͱ��� �̵��Ͽ� �������� ���� ���� �� �ݺ����� ������ �����Ѵ�.
			while (rs.next()) {
				// �����Ͱ� ����Ű�� ���� �ڷḦ �������� ���
				// ����)  rs.get�ڷ��� �̸�("�÷��� �Ǵ� alias ��")
				// ����2) rs.get�ڷ��� �̸�(�÷���ȣ) (�Ӽ���ȣ��) 1���� ������ �����Ͱ� ����Ű�� ���� 1�� ���ڵ带 ����Ű�Ƿ� �÷����� �ο��ϴ� ������ ��� ĭ���� ����
				System.out.println("LPROD_ID : " + rs.getInt("lprod_id")); //��ȣ ���� ��ҹ��� ���� ����
				System.out.println("LPROD_GU : " + rs.getString(2)); 
				System.out.println("LPROD_NM : " + rs.getString("LPROD_NM")); 
				System.out.println("-----------------------------------------"); 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. �ڿ� �ݳ�
			// ����� conn, stmt, rs ��ü�� �ݴµ� ���� ��ü���� �ݴ´�
			if(rs != null) try { rs.close();} catch(SQLException e) {}
			if(stmt != null) try { stmt.close();} catch(SQLException e) {}
			if(conn != null) try { conn.close();} catch(SQLException e) {}
		}
	}
}

