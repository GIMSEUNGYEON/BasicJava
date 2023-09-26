package chapter03;

import java.util.Scanner;

public class tryIt {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int i;
		//System.out.println("입력된 숫자  :\"" + i + "\"");
		//System.out.println( "숫자를 입력하세요 :" );
		i= sc.nextInt();
		tryGo();
		
	}
	public static void tryGo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		
		String grade = "";
		int score = sc.nextInt();
		if(score > 89 && score < 101) {
			grade = "A";
		}
		}
}
