package homework;

public class _821 {
	public static void main(String[] args) {
	homework01();
	homework02();
	homework03();
	}
	
	
		public static void homework01() {
	    //1-2+3-4+5-6+7-8+9-10 =?
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			if(i%2!=0) {
				sum+=i;
			}else {
				sum-=i;
			}
		}System.out.println(sum);
	}
		
		public static void homework02() {
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
			}for(int j = 8; j>i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
		public static void homework03() {
			/*  ***** 
			 *   ****
			 *    ***
			 *     **
			 *      *
			 */
			for(int i = 0; i < 6; i++) {
				for(int j =0; j<i; j++) {
					System.out.print(" ");
				}for(int j = 5; j>i; j--) {
					System.out.print("*");
				}System.out.println();
			}
		}
}
