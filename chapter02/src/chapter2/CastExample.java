
package chapter2;

import java.util.Scanner; // 이 줄 쓰기 전에는  Scanner 클래스를 이용할 수 없음

public class CastExample {
	public static void main(String[] args) {
		round();
	}
	public static void round() {
		// 여러 자리의 소수점을 포함하는 실수를 키보드로 입력 받아 소수점 3자리에서 반올림 후 출력하시오
		// 키보드로 입력
		// 1) Scanner class import
		// 		import java.util.Scanner;
		// 2) Scanner class 객체 생성 - new 연산자 사용
		//   	Scanner sc = new Scanner(System.in);
		// 3) 입력메시지 출력 - System.out.print("메시지");
		// 		System.out.print("실수 자료 입력 : ");
		// 4) 입력 자료 저장 - Scanner class의 입력자료형에 맞는 메소드를 사용
		// 		정수 입력 : nextInt(), 실수 입력 : nextFloat(), 혹은 nextDouble()
		// 		문자 입력 : next()(공백으로 데이터 입력), 혹은 nextLine()(엔터치기 전까지 한줄 취급), ...
		
		
		Scanner sc = new Scanner(System.in);
		 		System.out.print("" );
		 		double num = sc.nextDouble();
		 		double num1 = num;
		 		double num2 = num;
		 		
		 		num1 = (int)(num1*100 + 0.5)/100;
		 		System.out.println(num1);
		 		
		 		num2 = (int)(num2*100 + 0.5)/100.; //위의 식과 끝의 .하나 차이 난다
		 		System.out.println(num2);
		 		
		 		num = num*100;
		 		num = num+0.5;
		 		num = (int)num;
		 		num = num/100;
		 		System.out.println(num);
		 		//23.4268 입력하시오
		}
}
