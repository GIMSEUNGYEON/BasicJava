package ddit._822.study;

import java.util.Scanner;

public class JavaMethod {
	public static void main(String[] args) {
		JavaMethod jm = new JavaMethod();

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ��� : ");
		String four = sc.next();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int num2 = sc.nextInt();

		double res;
		if (four.equals("+")) {
			res = jm.add(num1, num2);
			System.out.println("������ : " + res);
		} else if (four.equals("-")) {
			res = jm.printMinus(num1, num2);
			System.out.println("������ : " + res);
		} else if (four.equals("*")) {
			res = jm.gop(num1, num2);
			System.out.println("������ : " + res);
		} else if (four.equals("/")) {
			res = jm.printNanugi(num1, num2);
			System.out.println("������ : " + res);
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
//		jm.print();
//		jm.print("�׽�Ʈ");
//		jm.print(4);
//		jm.add(5, 4);
//		int result = jm.add(5, 4);
//		System.out.println(result);
		int c = jm.add();
		System.out.println(c);
//		jm.printAdd(2, 4);
//		jm.printAdd();
//		int result2 = jm.printMinus(5, 2);
//		System.out.println(result2);
//		double result3 = jm.printNanugi(5, 2);
//		System.out.println(result3);
	}

	public void print() {
		System.out.println("print �Դϴ�.");
	}

	public void print(String s) {
		System.out.println("���ڿ� " + s + "�� �Է¹��� print �Դϴ�.");

	}

	public void print(int num) {
		System.out.println("���� " + num + "�� �Է¹��� print �Դϴ�.");
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add() {
		JavaVar jv = new JavaVar();
		return (jv.a + jv.b);
	}

	public void printAdd(int a, int b) {
		int sum = add(a, b);
		System.out.println(sum);
	}

	public void printAdd() {
		int aa = add();
		System.out.println(aa);
	}

	public int printMinus(int a, int b) {
		return a - b;
	}

	public int gop(int a, int b) {
		return a * b;
	}

	public double printNanugi(int a, int b) {
		return (double) a / b;
	}

}

class JavaVar {
	public int a = 3;
	public int b = 2;
}
