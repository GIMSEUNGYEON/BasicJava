package ddit._822.study;

import java.util.Scanner;

public class JavaExample2_823 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JavaExample2_823 obj = new JavaExample2_823();
		// obj.test1();
		obj.test2();

	}

	public void test1() {
		// 각 기본형 변수 타입을 적어보고 선언하기
		byte b = 3;
		short s = 1432;
		int i = 524545243;
		long l = 574294642645674562l;
		float f = 3.4f;
		double d = 4.3254243524525245;
		boolean bool = true;
		char ch = 'a';
	}

	public void test2() {
		// 각 데이터를 형변환하고 출력하시오.
		char c1 = 'a';
		int i1;
		i1 = (int) c1;

		int i2 = 65;
		char c2 = (char) i2;
		for (int i = 12; i < 100; i++) {
			c2 = (char) i;
			System.out.println(c2);
			if (c2 == 'Z') {
				break;
			}
		}

		int a = 3;
		int b = 7;
		double d3 = (double) (b) / (double) (a);
		System.out.println(d3);
		d3 = (double) b / a;
		System.out.println(d3);

		char c4 = 'a';
		String s4;
		s4 = String.valueOf(c4);
		// s4 = c4 + "";
		System.out.println(s4);

		char[] c5;
		String s5 = "a";
		c5 = s5.toCharArray();
		for (int i = 0; i < c5.length; i++) {
			System.out.println(c5[i]);
		}
	}

	public void test3() {

	}
}
