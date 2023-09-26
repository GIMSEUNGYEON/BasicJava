package ddit.chap04.sec01;

import java.util.Scanner;

public class switchStatementExample01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		switchStatementExample01 sse = new switchStatementExample01();
		// 변수가 어떤 값을 갖는가에 따라 실행문 선택
		// 같은 기능의 if문보다 코드가 간결해지는 장점이 있음
		// 회원 등급을 입력받아 그 값이 1등급이면 VIP회원입니다를 출력
		// 2,3등급이면 우수회원입니다 출력
		// 4~6등급이면 일반회원입니다 출력
		// 7~9등급이면 신규회원입니다
		// 다른 값이면 잘못된 등급입니다 출력
		
		//sse.example01();
		sse.example02();
	}
		
		public void example01() {
		System.out.print("회원 등급을 입력하세요 : ");
		int degree = sc.nextInt();
		String message = "";
		switch (degree) {
		case 1:
			message = "VIP";
			break;
		case 2:
		case 3:
			message = "우수";
			break;
		case 4:
		case 5:
		case 6:
			message = "일반";
			break;
		case 7 : 
		case 8 : 
		case 9 : 
			message = "신규";
			break;
		default :
			message = "잘못된 입력입니다.";
		}
		if(message.equals("잘못된 입력입니다.")) {
			System.out.println(message);
		}else {
		System.out.println("회원님은 "+ message + "등급입니다.");
		}
	}
		//영문으로 된 국가명을 입력받아 "kor" 또는 "korea"면 대한민국
		//"jpn""japan"이면 일본
		//chn china 면 중국 출력
		
		public void example02 () {
		System.out.print("나라를 입력하세요 : ");
		String country = sc.next();
		String message1 = "";
		switch(country) {
		case "kor": case "korea":
			message1 = "한국";
			break;
		case "jpn": case "japan":
			message1 = "일본";
			break;
		case "chn": case "china":
			message1 = "중국";
			break;
		default :
			message1 = "잘못된 입력입니다.";
		}if(message1.equals("잘못된 입력입니다.")) {
			System.out.println(message1);
		}else{ 
			System.out.println("국가명은 " + message1 + "입니다.");
		}
	}
}

