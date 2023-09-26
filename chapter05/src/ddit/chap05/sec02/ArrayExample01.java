package ddit.chap05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
		//arrayMethod01();
	ArrayExample01 ae = new ArrayExample01();
	ae.arrayMethod01();
	}

	public static void arrayMethod01() {
		// 정수형 배열 10 생성
		// 실수형 배열 3 생성 10.5, 30.0, 0.34 입력
		int[] num = null;
		num = new int[10];

		int[] num1 = new int[10];
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1[" + i + "]=" + num1[i]);
		}
		// 배열은 참조형 변수이기 때문에 값을 저장하지 않을 땐 0이 아니라 null로 초기화
		// 초기화하지 않을 경우엔 정수형이기 때문에 0이 자동으로 저장됨, 선언만 할땐 null로 지정

		double[] dvalue =new double[] { 10.5, 30.0, 0.34 };
		double[] value = { 10.5, 30.0, 0.34 };
		double[] value1 = new double[3];
		value1[0]=10.5;
		value1[1]=30.0;
		value1[2]=0.34;
		
		
		//26개 요소를 갖는 문자배열에 알파벳 'A~Z'까지 넣기
		char [] alphabet = new char[26];
		for(int i =0; i<alphabet.length; i++) {
			alphabet[i]=(char)('A'+i);
		}
		System.out.println(alphabet);
	}
	public static void test01() {
		char[]alphabet = new char[26];
		char a = 65;
		for(int i = 0; i<alphabet.length; i++) {
			alphabet[i] = a;
			a++;
		}System.out.println(alphabet);
	}
	
	
}
