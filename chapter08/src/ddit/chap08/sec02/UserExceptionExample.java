package ddit.chap08.sec02;
//생성자 생성 예외 클래스

// Exception class를 상속
// throws 명령을 이용해서 예외를 강제로 발생시킴

public class UserExceptionExample {
	public static void main(String[] args) {
		try {
			System.out.println("예외 발생");
			throw new MyExcetion("사용자 생성 예외");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

class MyExcetion extends Exception {
	MyExcetion(String errMsg) {
		super(errMsg);
	}
}