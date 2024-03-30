package kr.or.ddit.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//JDBC(Java DataBase Connectivity) 라이브러리를 이용한 DB 자료를 처리하는 예제
public class jdbcTest01 {
		/*DB처리 순서
		 * 1. 드라이버 로딩 ==> 라이브러리를 이용할 수 있게 메모리로 읽어들이는 작업
		 * ==> JDBC 버전 4.0 이상에서는 getConnection()메서드에서 자동으로 로딩 해준다.
		 * 그래서 생략 가능하다.(생략하지 않고 사용할 예정)
		 * 실무에서 프로그래밍하다 보면 최신 버전이 아닌 예전 버전에서도 작업하게 된다.
		 * Class.forName("oracle.jdbc.driver.OracleDriver);
		 *
		 *2. DB 시스템에 접속하기 ==> 접속이 완료되면 Connection 개체가 반환된다.
		 *	DriverManager.getConnection()메소드를 이용한다.
		 *
		 *3. 질의 작업 ==>SQL 쿼리 문장을 만들어서 DB 서버로 보내서 결과를 얻어온다.
		 *(Statement객체 또는 PrepareStatement 객체를 이용하여 작업한다.
		 *
		 *4. 결과 처리 작업
		 *	1)SQL 문이 select문 일경우 select한 결과가 ResultSet객체에 저장되어 반환된다.
		 *	2)insert, delete, update문 등일 경우 : 정수값이 반환됨
		 *	    이 정수 값은 실행에 영향 받은 행의 개수를 의미.
		 *
		 * 5. 사용한 자원을 반납한다. ==> 각 객체의 close()메서드를 이용한다.
		 * 
		 */
	public static void main(String[] args) {
		//DB 작업에 필요한 변수 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc02", "java");
			
			//3. 질의
			//3-1. SQL쿼리문 작성
			String sql = "select * from lprod";
			//3-2. Statement 객체 생성 ==> 질의를 처리하는 객체
			stmt = conn.createStatement();
			
			//3-3. DB 서버로 전송하고 DB 서버가 처리한 결과를 얻어온다.
			//	   (지금은 실행할 쿼리문이 select문이기 때문에 ResultSet에 저장된다.
			rs = stmt.executeQuery(sql);
			
			//4. 결과 처리하기 ==> 한 레코드씩 화면에 출력하기
			//ResultSet에 저장된 데이터를 차례로 꺼내오려면 반복문과 next()문을 사용해서 처리한다.
			System.out.println(" == 쿼리문 처리 결과  == ");
			//rs.next : rs객체의 데이터를 가리키는 포인터를 다음번째 레코드위치로 이동시키고 그 곳에 데이터가 있으면 true, 없으면 false를 반환한다.
			//포인터는 첫번째 데이터를 가리키는 것이 아닌 바로 위를 가리키고 있다가 rs.next를 실행시키면 첫번째 레코드로 이동하여 데이터 여부를 판별하고 while 반복문을 실행을 결정한다.
			// rs.next를 실행시킬 때마다 포인터가 다음 데이터로 이동하며 마지막 데이터까지 이동하여 데이터의 행이 끝날 때 반복문의 실행을 종료한다.
			while (rs.next()) {
				// 포인터가 가리키는 곳의 자료를 가져오는 방법
				// 형식)  rs.get자료형 이름("컬럼명 또는 alias 명")
				// 형식2) rs.get자료형 이름(컬럼번호) (속성번호임) 1부터 시작함 포인터가 가리키는 것은 1번 레코드를 가리키므로 컬럼명을 부여하는 것으로 어느 칸인지 지정
				System.out.println("LPROD_ID : " + rs.getInt("lprod_id")); //괄호 안은 대소문자 구분 안함
				System.out.println("LPROD_GU : " + rs.getString(2)); 
				System.out.println("LPROD_NM : " + rs.getString("LPROD_NM")); 
				System.out.println("-----------------------------------------"); 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. 자원 반남
			// 선언된 conn, stmt, rs 객체를 닫는데 하위 개체부터 닫는다
			if(rs != null) try { rs.close();} catch(SQLException e) {}
			if(stmt != null) try { stmt.close();} catch(SQLException e) {}
			if(conn != null) try { conn.close();} catch(SQLException e) {}
		}
	}
}

