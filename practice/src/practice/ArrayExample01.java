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
		//선언 후 초기값을 지정하는 경우
		System.out.println(i);
		i = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		
	}
	public static void test02(){
		int x [] = new int [5];
		//이렇게 선언했을 경우 배열에 값을 입력하는 방법
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;
		System.out.println(x);//이건 주소 출력...
		System.out.println(x[0]);//이게 값 출력

		//배열 출력하기
		
		for(int i = 0; i <5; i++) {
			System.out.printf("x[%d] = %d\n", i, x[i]);
			}
		//배열의 누적 합 구하기
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum+=x[i];
		}System.out.println(sum);
	}
	public static void test03() {
		int x[] = new int[]{1,2,3,4,5};
		System.out.printf("배열의 크기 = %d\n", x.length);
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum+=x[i];
		}System.out.printf("배열의 합 = %d\n", sum);
	}
	
	public static void test04() {
		//실수형 배열
		double x[] = { 10.01, 20.02, 30.03, 40.04, 50.05};
		System.out.printf("실수형 배열의 크기 = %d\n", x.length);
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("x[%d] = %f\n", i, x[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		System.out.printf("실수형 배열의 합 = %f\n", sum);
	}
	public static void test05() {
		//문자형 배열의 선언 char
		char x [] = {'a', 'b', 'c', 'd', 'e', ' '};
		//문자형 배열의 크기
		System.out.printf("문자형 배열의 크기 : %d\n", x.length);
		//배열에 저장된 문자를 출력
		for(char c : x) {  //이게 뭔데?! 책은 개서된 for문 사용이라고 칭함
			System.out.printf("%3c",c);
		}
	}
	public static void testProblem() {
		// 20개의 자료를 입력받아 총점 및 평균을 구하고 평균을 이용해 학점 출력, 단 입력 성적이 -1이면 프로그램을 종료할것
		Scanner sc = new Scanner(System.in);
		int score [] = new int [20];
		int i = 0; //배열 인덱스
		int count = 0; //배열 길이
		int sum = 0;
		double avg;
		char grade;
		for(; i<score.length;i++){
			System.out.println((i+1) + "번째 성적을 입력하세요  : ");
			int x = sc.nextInt();
			if(i>100 || i < 0) { 
				break;} 
			score[i]= x;
			count++;
			
		}
		
		System.out.println("입력된 값");
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
		System.out.printf("총점 : %d\n 평균 : %f\n 학점 : %c", sum, avg, grade);
		
	}
}
