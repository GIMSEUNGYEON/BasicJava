package ddit.chap02.sec02;

public class integerExample {

	public static void main(String[] args) {
		// byteMethod();
		// shortMethod();
		//intMethod();
		longMethod();
		
	}

	public static void byteMethod() {
		byte b = 127;
		byte c = ++b;
		System.out.println(c);
		//순환적용
	}

	public static void shortMethod() {
		short s1 = 90;
		System.out.println(s1);

		s1 = (short) (s1 + 32767);
		System.out.println(s1);
		//순환적용
	}

	public static void intMethod() {
		int i1 = 1000000;
		int i2 = 1000000;
		int res = i1 * i2;
		System.out.println(res);
		//순환적용
	}
	
	public static void longMethod() {
		int n1 = 1000000;
		int n2 = 1000000;
		long res1 = n1 * n2;
		System.out.println(res1);
		
		long res2 = 1000000000000l;
		System.out.println(res2);
		
		long l1 = 1000000;
		long l2 = 1000000;
		long res3 = l1 * l2;
		
	}
	
}
