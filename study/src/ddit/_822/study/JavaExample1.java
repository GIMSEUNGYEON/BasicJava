package ddit._822.study;

import java.util.Scanner;

public class JavaExample1 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JavaExample1 je = new JavaExample1();
		// je.test1();
		// je.test2();
		//je.test3();
		//je.test4();
		test05();
	}

	public void test1() {
		// 키보드로부터 숫자를 입력받아 해당 숫자에 해당하는 구구단 출력
		System.out.print("숫자를 입력하세요 : ");
		int no = sc.nextInt();
		int result;
		for (int i = 1; i < 10; i++) {
			result = i * no;
			System.out.println(no + "  *  " + i + "  =  " + result);
		}
	}

	public void test2() {
		int result;
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				result = i * j;
				System.out.print(i + " * " + j + " = " + result + "\t");
			}
			System.out.println();
		}
	}

	public void test3() {
		// 숫자를 입력하여 해당 구구단을 제외하고 출력
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (num != i) {
					result = i * j;
					System.out.println(i + " * " + j + " = " + result);
				} else {
				}
			}
		}

	}

	public void test4() {
		// 대문자는 소문자로 소문자는 대문자로 입력
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		String result = "";
		for (char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				result += Character.toUpperCase(ch);
			} else {
				result += Character.toLowerCase(ch);
			}
		}
		System.out.println(result);
	}
	public static void test05() {
		System.out.println("!@#$%^&*(\\'\"<>?:;");
	}
}
