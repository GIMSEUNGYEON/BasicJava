package ddit.chap03.sec01;

public class arithmeticOperatorMethod02 {
	public static void main(String[] args) {
//		입력                출력
//	   A   B   AND  OR  EX-OR (두 값이 서로 달라야 트루 같으면 펄스)
//     0   0    0   0     0
//     0   1    0   1     1
//     1   0    0   1     1
//     1   1    1   1     0
		//logicalOperator();
		bitwise();
	}
	public static void logicalOperator() {
		char ch = '0';
		int num = 100;
		System.out.println((int)'0');
		boolean flag = ch>'a' && num!=50;
		System.out.println(flag);
		flag = ch>'a' || num!=50;
		System.out.println(flag);
		
	}
	public static void bitwise() {
		// & | ^(ex-or)
		// 27 = 2진수  11011 19 = 2진수 10011
		// 27 & 19 = 19
		// 27 | 19 = 27
		// 27 ^ 19 = 8
		
		int val1 = 20;
		int val2 = 19;
		System.out.println("비트별 & : " + (val1&val2));
		System.out.println("비트별 | : " + (val1|val2));
		System.out.println("비트별 ^ : " + (val1^val2));
	}
}
