
package chapter2;

import java.util.Scanner; // �� �� ���� ������  Scanner Ŭ������ �̿��� �� ����

public class CastExample {
	public static void main(String[] args) {
		round();
	}
	public static void round() {
		// ���� �ڸ��� �Ҽ����� �����ϴ� �Ǽ��� Ű����� �Է� �޾� �Ҽ��� 3�ڸ����� �ݿø� �� ����Ͻÿ�
		// Ű����� �Է�
		// 1) Scanner class import
		// 		import java.util.Scanner;
		// 2) Scanner class ��ü ���� - new ������ ���
		//   	Scanner sc = new Scanner(System.in);
		// 3) �Է¸޽��� ��� - System.out.print("�޽���");
		// 		System.out.print("�Ǽ� �ڷ� �Է� : ");
		// 4) �Է� �ڷ� ���� - Scanner class�� �Է��ڷ����� �´� �޼ҵ带 ���
		// 		���� �Է� : nextInt(), �Ǽ� �Է� : nextFloat(), Ȥ�� nextDouble()
		// 		���� �Է� : next()(�������� ������ �Է�), Ȥ�� nextLine()(����ġ�� ������ ���� ���), ...
		
		
		Scanner sc = new Scanner(System.in);
		 		System.out.print("" );
		 		double num = sc.nextDouble();
		 		double num1 = num;
		 		double num2 = num;
		 		
		 		num1 = (int)(num1*100 + 0.5)/100;
		 		System.out.println(num1);
		 		
		 		num2 = (int)(num2*100 + 0.5)/100.; //���� �İ� ���� .�ϳ� ���� ����
		 		System.out.println(num2);
		 		
		 		num = num*100;
		 		num = num+0.5;
		 		num = (int)num;
		 		num = num/100;
		 		System.out.println(num);
		 		//23.4268 �Է��Ͻÿ�
		}
}
