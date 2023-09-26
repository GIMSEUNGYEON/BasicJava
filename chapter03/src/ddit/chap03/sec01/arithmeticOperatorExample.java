package ddit.chap03.sec01;
//사칙연산자 : + - * / %

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
		System.out.print("첫번째 정수 입력하시오 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수 입력하시오 : ");
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
		// ++변수 / ++변수 : 변수의 값을 1씩 증가시킴
		// 결과 = 변수++ : 변수의 값을 결과에 저장하고 변수는 +1의 값을 가짐
		// 결과 = ++변수 : 변수에 +1을 하고 결과에 저장
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
		//비교 연산자
		//결과가 참이거나 거짓
		//조건문(if, while, ? for문 등)구성에 사용됨
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score >= 60 ) {
			System.out.println("pass");
		}else {
			System.out.println("umpass");
		}
	}
	void comparisonOperator2() {
		//키보드로 년도를 입력받아 윤년과 평년을 구별하시오
		//윤년 : 4의 배수이면서 100의 배수가 아니거나 400의 배수인 해
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오 : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}
	
}
	
