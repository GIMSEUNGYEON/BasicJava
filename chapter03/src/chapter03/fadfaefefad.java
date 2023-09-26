package chapter03;
import java.util.Scanner;

public class fadfaefefad {
	public static void main(String[] args) {
	
		//tryAgain();
		//tryGo();
		byte b = 100;
		System.out.println(b<<2);
	}
	public static void tryAgain() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		String grade = "";
		int score = sc.nextInt();
		if (score > 89 && score < 101) {
			grade = "A";
		}else if(score> 79 && score < 91 ) {
			grade = "B";
		}else if(score> 69 && score < 81 ) {
			grade = "C";
		}else if(score> 59 && score < 71 ) {
			grade = "D";
		}else 
			grade = "F";
		System.out.println( "성적은 " + grade + "입니다");
	
	}
	public static void tryGo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int gen = (age/10)*10;
		System.out.println("당신은 " + gen + "대 입니다.");
		
	}
}	
	
