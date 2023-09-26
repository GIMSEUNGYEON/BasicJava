package ddit.chap04.sec01;

import java.util.Random;
import java.util.Scanner;

public class ifStatementExample03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ifStatementExample03 ist = new ifStatementExample03();
		// �� Ŭ������ ���������� ���� �޼ҵ带 ������ �� static�� �������� �ʾƵ� ��
		// ist.ifMethod01();
		ist.ifMethod001();
		//ist.ifMethod02();
		//ist.randomExample();
	}

	public void ifMethod01() {
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		String message = "";
		if (score > 100) {
			message = "�߸��� �Է�";
		} else if (score > 89) {
			message = "A";
			if (score > 95) {
				message += "+";
			} else if (score > 93) {
				message += "0";
			} else {
				message += "-";
			}
		} else if (score > 79) {
			message = "B";
			if (score > 85) {
				message += "+";
			} else if (score > 82) {
				message += "0";
			} else {
				message += "-";
			}
		} else {
			message = "fail";
		}
		System.out.println("������ " + message + "�Դϴ�.");
	}
	public void ifMethod001() {
		// switch �̿�
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		String grade = "";
		
		switch(score/10) {
		case 10 :
		grade ="A+";
		if(score >100) {
			grade = "�߸��� �Է��Դϴ�.";
		}
		break;
		case 9 :
			grade = "A";
			switch(score%10) {
			case 0: case 1: case2:
				grade+="+";
				break;
			case 3: case 4: case 5:
				grade+="0";
				break;
				default:
				grade+="+";
			}
			break;
		case 8 :
			grade = "B";
			switch(score%10) {
			case 0: case 1: case2:
				grade+="+";
				break;
			case 3: case 4: case 5:
				grade+="0";
				break;
				default:
				grade+="+";
			}
			break;
		default : 
			grade = "fail";
		}
		System.out.println(grade);
	}
	private void ifMethod02() {
		// 1~100������ ������ ���� 2���� �����Ͽ� ũ������� ū�� - ������
		// �����Ͻÿ�(descending sort)
		Random r = new Random();
		int ran01 = r.nextInt(100) + 1;
		int ran02 = r.nextInt(100) + 1;

		if (ran01 > ran02) {
			System.out.println("ran01 - ran02 : \n" + ran01 + "-" + ran02);
		} else {
			System.out.println("ran02 - ran01 : \n" + ran02 + "-" + ran01);
			// �̰� �׳� ��¸� ������� ���ִ� �ڵ��̴�
		}
	}

	private void randomExample() {
		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		System.out.println(num1 + "," + num2);
		System.out.println("-----------------------");
		// ������ ����������� ������ �ٲٷ��� �ٸ� ����� �����
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + "," + num2);
	}
}
