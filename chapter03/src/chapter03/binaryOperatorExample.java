package chapter03;

import java.util.Scanner;

//이항 연산자
public class binaryOperatorExample {
		public static void main(String[] args) {
			//arithmethicOperator();
			realtionalOperator();
			//realtionalOperator2();
			//logicalOperator();
		}
		public static void arithmethicOperator(){
			//사칙연산
			int even = 0;
			int odd = 0;
		for (int i =1; i<101; i++) {
			if(i%2==0) {
				even = even + i;
			}else{
				odd = odd + i;
			}
		}
		System.out.println("짝수의 합 : " + even + "\n홀수의 합 : " + odd );
		}
		public static void realtionalOperator() {
			//비교 연산 : 크기 비교
			//결과는 true/false로 출력되고, 조건문에 사용됨
			//키보드로 입력받은 점수가 
			/*90~100 A
			80~89 B
			70~79 C
			60~69 D
			그 이하는 F*/
			Scanner sc = new Scanner(System.in);
			System.out.print("점수 : " );
			
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
				
			System.out.println("학점은 " + grade + "입니다.");
		}
		
		public static void realtionalOperator2() {
			//키보드로 나이를 입력받아 그 사람이 어느 구간에 속하는지 출력
			Scanner scn = new Scanner(System.in);
			System.out.print("나이를 입력하세요 : ");
			String generation = "";
			int age = scn.nextInt();
			if(age>9 && age<20) {
				generation = "10대입니다.";
			}else if(age>19 && age<30) {
				generation = "20대입니다.";
			}else if(age>29 && age<40) {
				generation = "30대입니다.";
			}else if(age>39 && age<50) {
				generation = "40대입니다.";
			}else if(age>49 && age<60) {
				generation = "50대입니다.";
			}else if(age>59 && age<70) {
				generation = "60대입니다.";
			}
			System.out.println(generation);
			
			System.out.println("----------------------------");
			
			System.out.print("나이를 입력하세요 : " );
			int age2 = scn.nextInt();
			int gen = (age2/10)*10;
			String message = gen +" 대입니다.";
			System.out.println(age2 + " 세는 " + message);
			
		}
		public static void logicalOperator() {
			//논리 연산자 
			//자신의 출생년도를 입력받아 윤년과 평년을 판단하시오
			//윤년 : 4의 배수이면서 100의 10수가 아닌해이거나 400의 배수인 해
			Scanner sc = new Scanner(System.in);
			System.out.print("출생 년도를 입력하세요 : " );
			int birth = sc.nextInt();
			if((birth%4==0 && birth%100!=0)||birth%400==0) {
				System.out.println(birth + "는 윤년입니다.");
			}else {
				System.out.println(birth + "는 평년입니다.");		
			}
		}

}
