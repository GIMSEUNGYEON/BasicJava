package homework;
	import java.util.Scanner;
	import java.util.Random;
public class _817 {
	//if���� �̿��� ����������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� : ");
		int player = sc.nextInt();
		String message = "";
		
		if(player == 1) { 
			message = "����";
		}else if (player == 2) {
			message = "����";
		}else if(player == 3) {
			message = "��";
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
			System.exit(0);
		}
		System.out.println("player : " + message);

		String comMessage = "";
		Random r = new Random();
		int computer = r.nextInt(3)+1;
		
		if(computer == 1) { 
			comMessage = "����";
		}else if (computer == 2) {
			comMessage = "����";
		}else if(computer == 0) {
			comMessage = "��";
		}
		System.out.println("computer : " + comMessage);
		
		if(player - computer == -2 || player - computer == 1) {
			System.out.println("player win");
		}else if (computer - player == -2 || computer - player == 1) {
			System.out.println("computer win");
		}else {
			System.out.println("�����ϴ�. ");
		}
	}
	
}
