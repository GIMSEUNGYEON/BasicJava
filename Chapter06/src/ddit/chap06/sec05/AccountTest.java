package ddit.chap06.sec05;

public class AccountTest {
	public static void main(String[] args) {
		Accountttt at = Accountttt.getInstance();
		System.out.println("첫번째 계좌의 주소 : " + at);

		Accountttt at1 = Accountttt.getInstance();
		System.out.println("두번째 계좌의 주소 : " + at1);
		
		// 다른 변수여도 같은 주소 출력됨
		
	}

}