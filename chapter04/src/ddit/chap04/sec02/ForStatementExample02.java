package ddit.chap04.sec02;

public class ForStatementExample02 {
	public static void main(String[] args) {
		// forMethod01();
		// forMethod02();
		// forMethod03();
		// forMethod04();
		forMethod05();
		//forMethod06();
	}

	public static void forMethod01() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void forMethod02() {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void forMethod03() {
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void forMethod04() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void forMethod05() {
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		for(int i = 0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}for(int star = 0; star<i*2+1;star++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	public static void forMethod06() {
		/*
		 *  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 */
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}for(int star = 8; star>i*2-1; star--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
