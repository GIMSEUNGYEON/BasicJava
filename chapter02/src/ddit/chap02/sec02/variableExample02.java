package ddit.chap02.sec02;

import java.util.Scanner;

public class variableExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = 100;

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String message;
		if (age >= 21) {
			message = "����";
		
		} else { 
			message = "û�ҳ�";
			
		}
		System.out.println(message);
		
		
	}
}
