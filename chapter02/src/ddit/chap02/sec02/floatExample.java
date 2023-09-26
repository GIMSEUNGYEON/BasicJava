package ddit.chap02.sec02;

public class floatExample {
	public static void main(String[] args) {
		// floatMethod();
		doubleMethod();
	}

	public static void floatMethod() {
		float pi = 3.1415926f;
		int rad = 15;
		System.out.println("원의 넓이 : " + (rad * rad * pi));
		float cir = (rad * rad * pi);
		System.out.println((int) (cir * 10 + 0.5) / 10);
		System.out.println("원의 둘레 : " + (2 * rad * pi));
	}

	public static void doubleMethod() {
		double d1 = 0.1;
		double d2 = 0.1f;
		System.out.println(d1);
		System.out.println(d2);
	}			
}
