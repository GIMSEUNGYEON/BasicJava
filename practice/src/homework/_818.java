package homework;
import java.util.Scanner;
public class _818 {
	public static void main(String[] args) {
		// _422();
		//_423();
		//_424();
		//_425();
		_426();
		//_427();
	}
	
	public static void _422() {
		int i=0;
		int sum = 0;
		for(i=0; i<101; i+=3) {
			sum+=i;
			System.out.println(sum);
		}	
	}
	
	public static void _423() {
		while (true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			int sum = num1 + num2;
			System.out.println("num1+num2 = " + sum);
			if(num1+num2 == 5) {
				break;
			}
		}
	}
	
	public static void _424() {
		int x = 0;
		int y = 0;
		for(x = 0; x < 11; x++) {
			for(y = 0; y <11; y++) {
				if((4*x + 5*y) == 60) { 
					System.out.println("x : " + x + "\ny : " + y);
				}
			}
		}
		
	}
	
	public static void _425() {
		
		for(int i=1; i<5; i++) {
			for(int j=0;j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void _426() {
		for(int i=1; i<5; i++) {
			for(int j=4;j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i; j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static void _427() {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());
			
			switch(menu) {
			case 1 : 
				System.out.print("예금액>");
				balance+=Integer.parseInt(scanner.nextLine());
				break;
			case 2 :
				System.out.print("출금액>");
				balance-=Integer.parseInt(scanner.nextLine());
				break;
			case 3 :
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4 : 
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}

	
	
	