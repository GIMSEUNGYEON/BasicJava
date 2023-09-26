package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample {
	static Scanner sc = new Scanner(System.in); // 여기서 입력하면 모든 클래스에서 스캐너 이용 가능

	public static void main(String[] args) {
		// if 문 예제
		// ifMethod01();
		// ifMethod02();
		ifMethod03();

	}

	public static void ifMethod01() {
		// 키보드로 점수를 입력받아 60점 이상이면 "합격"을 출력하시오
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		if (score >= 60) {
			System.out.println("\"합격\"");
		}
	}

	public static void ifMethod02() {
		// 정수 하나를 입력받아 홀수인지 짝수인지 판별하시오
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	public static void ifMethod03() {
		// 키보드로 1~12 사이의 정수를 입력 받아 3~5면 봄 6~8이면여름 9~11가을 12,1,2 겨울 출력
		System.out.print("월 입력 : ");
		int mon = sc.nextInt();
		String message = "";
		if (mon < 1 || mon > 12) {
			message = "잘못된 입력입니다.";
		} else {
			if (mon >= 3 && mon <= 5) {
				message = mon + "월은 봄 입니다.";
			} else if (mon >= 6 && mon <= 8) {
				message = mon + "월은 여름 입니다.";
			} else if (mon >= 9 && mon <= 11) {
				message = mon + "월은 가을 입니다.";
			} else {
				message = mon + "월은 겨울 입니다.";
			}
		}
		System.out.println(message);
	}
}
