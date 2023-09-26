package ddit.chap02.sec02;

import java.util.Scanner;

public class variableExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = 100;

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String message;
		if (age >= 21) {
			message = "성인";
		
		} else { 
			message = "청소년";
			
		}
		System.out.println(message);
		
		
	}
}
