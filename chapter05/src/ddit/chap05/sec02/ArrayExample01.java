package ddit.chap05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
		//arrayMethod01();
	ArrayExample01 ae = new ArrayExample01();
	ae.arrayMethod01();
	}

	public static void arrayMethod01() {
		// ������ �迭 10 ����
		// �Ǽ��� �迭 3 ���� 10.5, 30.0, 0.34 �Է�
		int[] num = null;
		num = new int[10];

		int[] num1 = new int[10];
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1[" + i + "]=" + num1[i]);
		}
		// �迭�� ������ �����̱� ������ ���� �������� ���� �� 0�� �ƴ϶� null�� �ʱ�ȭ
		// �ʱ�ȭ���� ���� ��쿣 �������̱� ������ 0�� �ڵ����� �����, ���� �Ҷ� null�� ����

		double[] dvalue =new double[] { 10.5, 30.0, 0.34 };
		double[] value = { 10.5, 30.0, 0.34 };
		double[] value1 = new double[3];
		value1[0]=10.5;
		value1[1]=30.0;
		value1[2]=0.34;
		
		
		//26�� ��Ҹ� ���� ���ڹ迭�� ���ĺ� 'A~Z'���� �ֱ�
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
