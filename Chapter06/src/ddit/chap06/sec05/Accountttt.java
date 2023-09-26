package ddit.chap06.sec05;

public class Accountttt {
	private String owner;
	private long balance;
	
	// Singlenton
	//1) private 객체변수 선언(타입은 본인 클래스 타입대로, 변수명은 instance, static)
	private static Accountttt instance = null;
	
	//2) 생성자 메소드를 선언 (private 접근 지정자를 가진 메소드로)
	
	private Accountttt() {
		owner = "홍길동";
	}
	
	//3) getInstance 메서드(접근 지정자 public이 보통, 반환타입은 자기 클래스, static)
	public static Accountttt getInstance() {
		if(instance==null) instance = new Accountttt();
		return instance;
		// 인스턴스가 널일 경우 새로운 객체를 생성할 수 있지만,
		// 널이 아닌 경우 이미 만들어진 인스턴스를 반환하여 하나만 만들 수 있는 원리
		// 간단하게 생성자 메소드를 프라이빗으로 만들고 인스턴스의 널 여부를 통해서만 
		// 객체를 생성할 수 있게 만들어준다.
		// 인스턴스는 static 타입으로 객체마다 모두 같은 값을 가지게 하여
		// 생성되기 전에는 null 값으로 객체를 생성
		// 생성되고 나서는 (else) 이미 생성된 객체를 반환해줌 
	}
}