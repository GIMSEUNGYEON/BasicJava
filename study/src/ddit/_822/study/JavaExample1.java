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
		// Ű����κ��� ���ڸ� �Է¹޾� �ش� ���ڿ� �ش��ϴ� ������ ���
		System.out.print("���ڸ� �Է��ϼ��� : ");
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
		// ���ڸ� �Է��Ͽ� �ش� �������� �����ϰ� ���
		System.out.print("���ڸ� �Է��ϼ��� : ");
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
		// �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� �Է�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
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
