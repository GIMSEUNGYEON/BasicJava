package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample {
	static Scanner sc = new Scanner(System.in); // ���⼭ �Է��ϸ� ��� Ŭ�������� ��ĳ�� �̿� ����

	public static void main(String[] args) {
		// if �� ����
		// ifMethod01();
		// ifMethod02();
		ifMethod03();

	}

	public static void ifMethod01() {
		// Ű����� ������ �Է¹޾� 60�� �̻��̸� "�հ�"�� ����Ͻÿ�
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		if (score >= 60) {
			System.out.println("\"�հ�\"");
		}
	}

	public static void ifMethod02() {
		// ���� �ϳ��� �Է¹޾� Ȧ������ ¦������ �Ǻ��Ͻÿ�
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}

	public static void ifMethod03() {
		// Ű����� 1~12 ������ ������ �Է� �޾� 3~5�� �� 6~8�̸鿩�� 9~11���� 12,1,2 �ܿ� ���
		System.out.print("�� �Է� : ");
		int mon = sc.nextInt();
		String message = "";
		if (mon < 1 || mon > 12) {
			message = "�߸��� �Է��Դϴ�.";
		} else {
			if (mon >= 3 && mon <= 5) {
				message = mon + "���� �� �Դϴ�.";
			} else if (mon >= 6 && mon <= 8) {
				message = mon + "���� ���� �Դϴ�.";
			} else if (mon >= 9 && mon <= 11) {
				message = mon + "���� ���� �Դϴ�.";
			} else {
				message = mon + "���� �ܿ� �Դϴ�.";
			}
		}
		System.out.println(message);
	}
}
