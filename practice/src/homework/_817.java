package homework;
	import java.util.Scanner;
	import java.util.Random;
public class _817 {
	//if문을 이용해 가위바위보
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보 : ");
		int player = sc.nextInt();
		String message = "";
		
		if(player == 1) { 
			message = "가위";
		}else if (player == 2) {
			message = "바위";
		}else if(player == 3) {
			message = "보";
		}else {
			System.out.println("잘못된 입력입니다.");
			System.exit(0);
		}
		System.out.println("player : " + message);

		String comMessage = "";
		Random r = new Random();
		int computer = r.nextInt(3)+1;
		
		if(computer == 1) { 
			comMessage = "가위";
		}else if (computer == 2) {
			comMessage = "바위";
		}else if(computer == 0) {
			comMessage = "보";
		}
		System.out.println("computer : " + comMessage);
		
		if(player - computer == -2 || player - computer == 1) {
			System.out.println("player win");
		}else if (computer - player == -2 || computer - player == 1) {
			System.out.println("computer win");
		}else {
			System.out.println("비겼습니다. ");
		}
	}
	
}
