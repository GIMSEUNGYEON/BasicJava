package ddit.chap03.sec01;
//��Ģ������ : + - * / %

	import java.util.Scanner;
	
public class arithmeticOperatorExample {
	public static void main(String[] args) {
		arithmeticOperator ao = new arithmeticOperator();
		//ao.airthmeticMethod01();
		//ao.unaryOperator();
		//ao.comparisonOperator();
		ao.comparisonOperator2();
		}
}

class arithmeticOperator {
	void airthmeticMethod01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		int y = sc.nextInt();
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
	}
	
	void unaryOperator() {
		int age = 30;
		System.out.println(+50);
		System.out.println(-50);
		System.out.println(~50);
		System.out.println((age>=18));
		System.out.println(!(age>=18));
		// ++���� / ++���� : ������ ���� 1�� ������Ŵ
		// ��� = ����++ : ������ ���� ����� �����ϰ� ������ +1�� ���� ����
		// ��� = ++���� : ������ +1�� �ϰ� ����� ����
		int a = age++;
		System.out.println(a);
		System.out.println(age);
		
		System.out.println("-------------------");
		
		int res = 30;
		System.out.println(res++);
		System.out.println(res);
		
		res = 30;
		System.out.println(++res);
		
	}
	void comparisonOperator() {
		//�� ������
		//����� ���̰ų� ����
		//���ǹ�(if, while, ? for�� ��)������ ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		if(score >= 60 ) {
			System.out.println("pass");
		}else {
			System.out.println("umpass");
		}
	}
	void comparisonOperator2() {
		//Ű����� �⵵�� �Է¹޾� ����� ����� �����Ͻÿ�
		//���� : 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
	}
	
}
	
