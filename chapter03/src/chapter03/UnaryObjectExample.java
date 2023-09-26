package chapter03;
//단항 연산자 예제 
public class UnaryObjectExample {
	public static void main(String[] args) {
		
	incrementOperator();
	signOperator();
	}
		public static void incrementOperator() {
			
		int res = 0;
		int incre = 10;
		int decre = 10;
		res = incre++;
		System.out.println("res : " + res + ", incre : " + incre);
		
		res = 0;
		res = --decre;
		System.out.println("res : " + res +" , decre :" + decre );
		
		int[] arr = {10, 20, 30, 40, 50};
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		}
		public static void signOperator() {
			//음수와 양수
			int sum = 0;
			int sign = -1;
			int cnt = 1;
			
			while(cnt<=10) {
				sign = sign*(-1);
				sum = sum+(sign*cnt);
				if(sign>0 && cnt!=1) {
					System.out.print("+" + cnt);
				}else {
					System.out.print(sign*cnt);
				}
				cnt++;
			}
			System.out.println("=" + sum);
		}

}
