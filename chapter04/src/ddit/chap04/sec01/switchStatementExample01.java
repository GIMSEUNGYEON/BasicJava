package ddit.chap04.sec01;

import java.util.Scanner;

public class switchStatementExample01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		switchStatementExample01 sse = new switchStatementExample01();
		// ������ � ���� ���°��� ���� ���๮ ����
		// ���� ����� if������ �ڵ尡 ���������� ������ ����
		// ȸ�� ����� �Է¹޾� �� ���� 1����̸� VIPȸ���Դϴٸ� ���
		// 2,3����̸� ���ȸ���Դϴ� ���
		// 4~6����̸� �Ϲ�ȸ���Դϴ� ���
		// 7~9����̸� �ű�ȸ���Դϴ�
		// �ٸ� ���̸� �߸��� ����Դϴ� ���
		
		//sse.example01();
		sse.example02();
	}
		
		public void example01() {
		System.out.print("ȸ�� ����� �Է��ϼ��� : ");
		int degree = sc.nextInt();
		String message = "";
		switch (degree) {
		case 1:
			message = "VIP";
			break;
		case 2:
		case 3:
			message = "���";
			break;
		case 4:
		case 5:
		case 6:
			message = "�Ϲ�";
			break;
		case 7 : 
		case 8 : 
		case 9 : 
			message = "�ű�";
			break;
		default :
			message = "�߸��� �Է��Դϴ�.";
		}
		if(message.equals("�߸��� �Է��Դϴ�.")) {
			System.out.println(message);
		}else {
		System.out.println("ȸ������ "+ message + "����Դϴ�.");
		}
	}
		//�������� �� �������� �Է¹޾� "kor" �Ǵ� "korea"�� ���ѹα�
		//"jpn""japan"�̸� �Ϻ�
		//chn china �� �߱� ���
		
		public void example02 () {
		System.out.print("���� �Է��ϼ��� : ");
		String country = sc.next();
		String message1 = "";
		switch(country) {
		case "kor": case "korea":
			message1 = "�ѱ�";
			break;
		case "jpn": case "japan":
			message1 = "�Ϻ�";
			break;
		case "chn": case "china":
			message1 = "�߱�";
			break;
		default :
			message1 = "�߸��� �Է��Դϴ�.";
		}if(message1.equals("�߸��� �Է��Դϴ�.")) {
			System.out.println(message1);
		}else{ 
			System.out.println("�������� " + message1 + "�Դϴ�.");
		}
	}
}

