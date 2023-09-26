package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample02 {
	public static void main(String[] args) {
		// if �� ���� 02
		// Ű�� ü���� ���� m�� kg�� �Է¹޾� bmi������ ����ϰ� bmi�� ���� ü�� �Ǵ�
		// 0 ~ 18.4 : ��ü��
		// 18.5 ~ 22.9 : ����ü��
		// 23.0 ~ 24.9 : ��ü��
		// 25.0 ~ 29.9 : ��
		// 30.0 ~ : ����
		// bmi ���� = ü��(kg) / (Ű(m) * Ű(m))

		Scanner sc = new Scanner(System.in);

		System.out.print("Ű�� �Է��ϼ��� : ");
		double h = sc.nextDouble();

		System.out.print("ü���� �Է��ϼ��� : ");
		double w = sc.nextDouble();
		double bmi = w / (h * h);
		System.out.println(bmi);
		String message = "";

		if (bmi < 0) {
			message = "�߸��� �Է��Դϴ�.";
		} else {
			if (bmi >= 0 && bmi <= 18.4) {
				message = "��ü���Դϴ�.";
			} else if (bmi <= 22.9) {
				message = "����ü���Դϴ�.";
			} else if (bmi <= 24.9) {
				message = "��ü���Դϴ�.";
			} else if (bmi <= 29.9) {
				message = "���Դϴ�.";
			} else {
				message = "�����Դϴ�.";
			}
		}
		System.out.println(message);
	}
}
