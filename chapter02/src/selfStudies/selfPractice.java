package selfStudies;

import java.util.Scanner;

public class selfPractice {
	public static void main(String[] args) {
//		0. 사용자가 낸 돈과 상품의 가격을 정수로 입력받아 잔돈을 출력해보세요.
//		1. 사용자가 정수 2개를 입력하고 첫번째 수를 두번째로 나눈 몫과 나머지를 출력해보세요.
//		2. 사용자가 입력한 정수의 제곱을 출력해보세요.
//		3. 사용자가 국어, 영어, 수학점수를 입력하면 총점과 평균을 출력해보세요.
//		4. 사용자의 이름과 나이의 값을 받아 출력해보세요.
//		5. 사각형의 가로, 세로를 정수로 입력받아 둘레와 넓이를 계산하여 출력하여 보세요.
		
		String state = "신용권";
		
		Scanner _0 = new Scanner(System.in);
		System.out.print("받은 돈을 입력하세요 : ");
		int recieved = _0.nextInt(); 
		System.out.print("상품의 가격을 입력하세요 : " );
		int price = _0.nextInt();
		int charge = recieved - price ;
		System.out.println("거스름 돈 : " + charge);
		
		Scanner _01 = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a = _01.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int b = _01.nextInt();
		int c = a/b;
		System.out.println("첫번째 정수를 두번째 정수로 나눈 몫 : " + c);
		int d = a%b;
		System.out.println("첫번째 정수를 두번째 정수로 나누었을 때의 나머지 : "+ d );
		
		Scanner _02 = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		
		
		
	}
		
}
