package selfStudies;

import java.util.Scanner;

public class selfPractice {
	public static void main(String[] args) {
//		0. ����ڰ� �� ���� ��ǰ�� ������ ������ �Է¹޾� �ܵ��� ����غ�����.
//		1. ����ڰ� ���� 2���� �Է��ϰ� ù��° ���� �ι�°�� ���� ��� �������� ����غ�����.
//		2. ����ڰ� �Է��� ������ ������ ����غ�����.
//		3. ����ڰ� ����, ����, ���������� �Է��ϸ� ������ ����� ����غ�����.
//		4. ������� �̸��� ������ ���� �޾� ����غ�����.
//		5. �簢���� ����, ���θ� ������ �Է¹޾� �ѷ��� ���̸� ����Ͽ� ����Ͽ� ������.
		
		String state = "�ſ��";
		
		Scanner _0 = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int recieved = _0.nextInt(); 
		System.out.print("��ǰ�� ������ �Է��ϼ��� : " );
		int price = _0.nextInt();
		int charge = recieved - price ;
		System.out.println("�Ž��� �� : " + charge);
		
		Scanner _01 = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int a = _01.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int b = _01.nextInt();
		int c = a/b;
		System.out.println("ù��° ������ �ι�° ������ ���� �� : " + c);
		int d = a%b;
		System.out.println("ù��° ������ �ι�° ������ �������� ���� ������ : "+ d );
		
		Scanner _02 = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		
		
		
		
	}
		
}
