package ddit.chap04.sec03;

import java.util.Scanner;

public class WhileStatementExample02 {
	public static void main(String[] args) {
		new WhileStatementExample02().init();
	}
	public void init() {
		String menu = "***Ŀ�� �޴�***\n";
		menu += "1. �Ƹ޸�ī��			2000��\n";
		menu += "2. ī���			3500��\n";
		menu += "3. ī��� �����ƶ�		5000��\n";
		menu += "4. �ڹ�Ĩ ����Ǫġ��	6500��\n";
		menu += "5. ���α׷� ����\n";

		int sum = 0;
		int exit = 0;

		String bill = "***������***\n";

		while (true) {
			System.out.println(menu + "");
			Scanner sc = new Scanner(System.in);
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				sum += 2000;
				bill += "�Ƹ޸�ī��			2000��\n";
				System.out.println(bill);
				break;
			case 2:
				sum += 3500;
				bill += "ī���			3500��\n";
				System.out.println(bill);
				break;
			case 3:
				sum += 5000;
				bill += "ī��� �����ƶ�		5000��\n";
				System.out.println(bill);
				break;
			case 4:
				sum += 6500;
				bill += "�ڹ�Ĩ ����Ǫġ��		6500��\n";
				System.out.println(bill);
				break;
			case 5:
				exit = -1;
				break;
			default:
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�.");
			}
			if (exit == -1) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		bill += "------------------------------\n�� �հ�\t\t\t" + sum + "��";
		System.out.println(bill);
	}
}
