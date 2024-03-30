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
		// 문제 : 사용자로부터 Lprod_id 값을 두개 입력받아서 두 값 사이 자료들을 출력
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int i = sc.nextInt();		
		System.out.println("두번째 숫자 입력 : ");
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
			max = i > ii ? i : ii; //i가 더 크면 max = i, ii가 더 크면 max = ii;
			min = i < ii ? i : ii;
			System.out.println(max);
			System.out.println(min);
//			int max2 = Math.max(i, ii);
//			int min2 = Math.min(i, ii);
			//제일 크거나 작은 값을 찾는 메소드
			
			//Statement 객체를 이용한 처리
//			String sql = "select lprod_id 분류번호, lprod_gu 분류코드, lprod_nm 분류명  from lprod where lprod_id between "+ i + " and " + ii;
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
			//PreparedStatement 객체를 이용해보기
			//SQL문을 작성할 떄 데이터가 들어갈 자리를 물음표로 표시해서 작성한다
			String sql = "select lprod_id 분류번호, lprod_gu 분류코드, lprod_nm 분류명  from lprod where lprod_id between ? and ?" ;
			//PreparedStatement 객체 생성 ==> 사용할 sql 쿼리문을 매개변수에 전달하여 작성한다
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(sql);
			//물음표 자리에 들어갈 데이터를 세팅한다.
			//형식 : PreparedStatement객체.set자료형이름(물음표번호, 저장할 데이터값);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			//데이터세팅이 완료되면 sql문 실행
			rs = pstmt.executeQuery();
			System.out.println(" == 쿼리문 실행 결과  ==");
			System.out.println("분류번호\t분류코드\t분류명");
			while(rs.next()) {
				System.out.printf("    %d\t%s\t%s\n", rs.getInt("분류번호"), rs.getString(2), rs.getString("분류명"));
				//속성에 별명을 부여한 경우엔 컬럼명을 쓸 수 없고 무조건 별명을 써야한다.
				
				
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
