package chapter03;

import java.util.Scanner;

//���� ������
public class binaryOperatorExample {
		public static void main(String[] args) {
			//arithmethicOperator();
			realtionalOperator();
			//realtionalOperator2();
			//logicalOperator();
		}
		public static void arithmethicOperator(){
			//��Ģ����
			int even = 0;
			int odd = 0;
		for (int i =1; i<101; i++) {
			if(i%2==0) {
				even = even + i;
			}else{
				odd = odd + i;
			}
		}
		System.out.println("¦���� �� : " + even + "\nȦ���� �� : " + odd );
		}
		public static void realtionalOperator() {
			//�� ���� : ũ�� ��
			//����� true/false�� ��µǰ�, ���ǹ��� ����
			//Ű����� �Է¹��� ������ 
			/*90~100 A
			80~89 B
			70~79 C
			60~69 D
			�� ���ϴ� F*/
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : " );
			
			String grade = "";
			int score = sc.nextInt();
			
			if (score>89 && score<101) {
				grade = "A";
			}else if(score>79 && score<90){
				grade = "B";
			}else if(score>69 && score<80) {
				grade = "C";
			}else if(score>59 && score<70) {
				grade = "D";				
			}else
				grade = "F";
				
			System.out.println("������ " + grade + "�Դϴ�.");
		}
		
		public static void realtionalOperator2() {
			//Ű����� ���̸� �Է¹޾� �� ����� ��� ������ ���ϴ��� ���
			Scanner scn = new Scanner(System.in);
			System.out.print("���̸� �Է��ϼ��� : ");
			String generation = "";
			int age = scn.nextInt();
			if(age>9 && age<20) {
				generation = "10���Դϴ�.";
			}else if(age>19 && age<30) {
				generation = "20���Դϴ�.";
			}else if(age>29 && age<40) {
				generation = "30���Դϴ�.";
			}else if(age>39 && age<50) {
				generation = "40���Դϴ�.";
			}else if(age>49 && age<60) {
				generation = "50���Դϴ�.";
			}else if(age>59 && age<70) {
				generation = "60���Դϴ�.";
			}
			System.out.println(generation);
			
			System.out.println("----------------------------");
			
			System.out.print("���̸� �Է��ϼ��� : " );
			int age2 = scn.nextInt();
			int gen = (age2/10)*10;
			String message = gen +" ���Դϴ�.";
			System.out.println(age2 + " ���� " + message);
			
		}
		public static void logicalOperator() {
			//�� ������ 
			//�ڽ��� ����⵵�� �Է¹޾� ����� ����� �Ǵ��Ͻÿ�
			//���� : 4�� ����̸鼭 100�� 10���� �ƴ����̰ų� 400�� ����� ��
			Scanner sc = new Scanner(System.in);
			System.out.print("��� �⵵�� �Է��ϼ��� : " );
			int birth = sc.nextInt();
			if((birth%4==0 && birth%100!=0)||birth%400==0) {
				System.out.println(birth + "�� �����Դϴ�.");
			}else {
				System.out.println(birth + "�� ����Դϴ�.");		
			}
		}

}
