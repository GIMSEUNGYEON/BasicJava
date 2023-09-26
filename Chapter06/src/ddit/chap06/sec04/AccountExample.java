package ddit.chap06.sec04;

public class AccountExample {
	public static void main(String[] args) {
		Account2 a2 = new Account2();
		Account2 a3 = new Account2();
		System.out.println("첫번째 계좌의 주소 : " + a2);
		System.out.println("두번째 계좌의 주소 : " + a3);
		//각각 다른 주소 출력됨
		// 이렇게 작성할 경우 매개변수가 없기 때문에
		// 매개변수가 지정되지 않은 10번 줄이 여기 호출됨
		// 클래스 객체를 최초로 생성했을 때 오너와 밸런스는 각각 null 과 0.0으로 초기화된다.
		a2.setOwner("홍길동");
		a2.setBalance(1000);
		// 이때 미리 만들어둔 세터로 프라이빗 변수를 불러내어 원하는 값으로 초기화할수 있으며
		// 방금 초기화한 값은 게터가 받아 초기화한 값을 객체로 만든 클래스로 보내어 사용할 수 있다.
		// 게터는 입력한 값을 사용해야하니까 따로 만들어야겠지만 세터는 그냥 변수를 두개 이상 입력해도 ㄱㅊ
		a2.deposit(100000);
		printAccount2Info(a2);
		a2.withDraw(5000);
		printAccount2Info(a2);
	}

	public static void printAccount2Info(Account2 a2) {
		System.out.println("예금주 : " + a2.getOwner());
		System.out.println("통장 잔고 : " + a2.getBalance());
		System.out.println("---------------------------------");
	}
}