package ddit.chap03.sec01;

public class arithmeticOperatorMethod02 {
	public static void main(String[] args) {
//		�Է�                ���
//	   A   B   AND  OR  EX-OR (�� ���� ���� �޶�� Ʈ�� ������ �޽�)
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
		// 27 = 2����  11011 19 = 2���� 10011
		// 27 & 19 = 19
		// 27 | 19 = 27
		// 27 ^ 19 = 8
		
		int val1 = 20;
		int val2 = 19;
		System.out.println("��Ʈ�� & : " + (val1&val2));
		System.out.println("��Ʈ�� | : " + (val1|val2));
		System.out.println("��Ʈ�� ^ : " + (val1^val2));
	}
}
