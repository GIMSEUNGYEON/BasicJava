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
		System.out.print("������ �Է��ϼ��� : ");
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
		System.out.println( "������ " + grade + "�Դϴ�");
	
	}
	public static void tryGo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		int gen = (age/10)*10;
		System.out.println("����� " + gen + "�� �Դϴ�.");
		
	}
}	
	
