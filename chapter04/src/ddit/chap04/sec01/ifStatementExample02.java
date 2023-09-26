package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample02 {
	public static void main(String[] args) {
		// if 문 예제 02
		// 키와 체중을 각각 m과 kg로 입력받아 bmi지수를 계산하고 bmi에 따른 체형 판단
		// 0 ~ 18.4 : 저체중
		// 18.5 ~ 22.9 : 정상체중
		// 23.0 ~ 24.9 : 과체중
		// 25.0 ~ 29.9 : 비만
		// 30.0 ~ : 고도비만
		// bmi 지수 = 체중(kg) / (키(m) * 키(m))

		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요 : ");
		double h = sc.nextDouble();

		System.out.print("체중을 입력하세요 : ");
		double w = sc.nextDouble();
		double bmi = w / (h * h);
		System.out.println(bmi);
		String message = "";

		if (bmi < 0) {
			message = "잘못된 입력입니다.";
		} else {
			if (bmi >= 0 && bmi <= 18.4) {
				message = "저체중입니다.";
			} else if (bmi <= 22.9) {
				message = "정상체중입니다.";
			} else if (bmi <= 24.9) {
				message = "과체중입니다.";
			} else if (bmi <= 29.9) {
				message = "비만입니다.";
			} else {
				message = "고도비만입니다.";
			}
		}
		System.out.println(message);
	}
}
