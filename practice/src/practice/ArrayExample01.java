package practice;

import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
		//intArray();
		//test02();
		//test03();
		//test04();
		//test05();
		testProblem();
	}
	public static void intArray() {
		int [] i = new int[10];
		//���� �� �ʱⰪ�� �����ϴ� ���
		System.out.println(i);
		i = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		
	}
	public static void test02(){
		int x [] = new int [5];
		//�̷��� �������� ��� �迭�� ���� �Է��ϴ� ���
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;
		System.out.println(x);//�̰� �ּ� ���...
		System.out.println(x[0]);//�̰� �� ���

		//�迭 ����ϱ�
		
		for(int i = 0; i <5; i++) {
			System.out.printf("x[%d] = %d\n", i, x[i]);
			}
		//�迭�� ���� �� ���ϱ�
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum+=x[i];
		}System.out.println(sum);
	}
	public static void test03() {
		int x[] = new int[]{1,2,3,4,5};
		System.out.printf("�迭�� ũ�� = %d\n", x.length);
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum+=x[i];
		}System.out.printf("�迭�� �� = %d\n", sum);
	}
	
	public static void test04() {
		//�Ǽ��� �迭
		double x[] = { 10.01, 20.02, 30.03, 40.04, 50.05};
		System.out.printf("�Ǽ��� �迭�� ũ�� = %d\n", x.length);
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("x[%d] = %f\n", i, x[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		System.out.printf("�Ǽ��� �迭�� �� = %f\n", sum);
	}
	public static void test05() {
		//������ �迭�� ���� char
		char x [] = {'a', 'b', 'c', 'd', 'e', ' '};
		//������ �迭�� ũ��
		System.out.printf("������ �迭�� ũ�� : %d\n", x.length);
		//�迭�� ����� ���ڸ� ���
		for(char c : x) {  //�̰� ����?! å�� ������ for�� ����̶�� Ī��
			System.out.printf("%3c",c);
		}
	}
	public static void testProblem() {
		// 20���� �ڷḦ �Է¹޾� ���� �� ����� ���ϰ� ����� �̿��� ���� ���, �� �Է� ������ -1�̸� ���α׷��� �����Ұ�
		Scanner sc = new Scanner(System.in);
		int score [] = new int [20];
		int i = 0; //�迭 �ε���
		int count = 0; //�迭 ����
		int sum = 0;
		double avg;
		char grade;
		for(; i<score.length;i++){
			System.out.println((i+1) + "��° ������ �Է��ϼ���  : ");
			int x = sc.nextInt();
			if(i>100 || i < 0) { 
				break;} 
			score[i]= x;
			count++;
			
		}
		
		System.out.println("�Էµ� ��");
		for(i=0; i<count; i++) {
			System.out.printf("score [%d] = %d\n",i,score[i]);
		}
		i = 0;
		while(i<count) {
			sum+=score[i];
			i++;
		}
		avg = (double)sum/count;
		
		switch((int)avg / 10) {
		case 10 : case 9 : 
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 : 
			grade = 'C';
			break;
		case 6 :  
			grade = 'D';
			break;
		default : 
			grade = 'f';
		}
		System.out.println();
		System.out.printf("���� : %d\n ��� : %f\n ���� : %c", sum, avg, grade);
		
	}
}
