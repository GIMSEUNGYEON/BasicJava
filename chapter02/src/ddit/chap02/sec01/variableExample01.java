package ddit.chap02.sec01;
public class variableExample01 {
	static int sum; 	
	public static void main(String[] args) {
		int score = 89; //변수 선언
		//sum = sum + score;
		sum+=score;
	System.out.println(sum);
	/*
	 * static int sum이 메인영역 안에 있으면 초기화되지 않은 sum은 연산하지 못하는데  
	 * 메인 영역 밖에서 정의된 변수는 왜 초기화되지 않아도 연산이 되는지 모르겠음
	 * +=와 =+의 차이?
	 */
	String a = new String("신용권");
	System.out.println(a);
	String b = new String("신용권");
	boolean t = a.equals(b);
	System.out.println(t); //true 출력
	
	System.out.println(a == b);//false 출력
	
	String aa = "신용권"; //new
	System.out.println(a == aa);	
	}
}
