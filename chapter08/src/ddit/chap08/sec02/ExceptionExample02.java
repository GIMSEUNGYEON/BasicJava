package ddit.chap08.sec02;

public class ExceptionExample02 {
	public static void main(String[] args) {
		int[] score = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		int avg = 0;
		try {
			int d = 0;
			for (int i = 0; i <= score.length; i++) {
				d=i+1;
				sum += score[i];
			}
			avg = sum / score.length;
		} catch (NumberFormatException e) {
			System.out.println("��ġ��ȯ ���ܹ߻�");
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�� ���ܹ߻�");
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
		} catch (Exception e) {
			System.out.println("��� ���ܹ߻�");
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
		}
		System.out.println("���α׷� ���� ����");
	}
	
}
