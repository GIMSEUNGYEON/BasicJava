package chapter2;

public class varialbleExample01 {
 static	int result;	
	public static void main(String[] args) {
		int score1 = 100;
		int score2 = 95;
		int score3 = 70;

		result = score1 + score2+ score3;
		System.out.println("���� : " + result );
		method1();
	}
	public static void method1() {
	
		System.out.println("��� : " + result/3);
		
		
		
	}
}
