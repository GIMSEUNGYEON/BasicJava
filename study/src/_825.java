import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _825 {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		//test0();
		//test1();
		test2();
	}

	public static void test0() {
		System.out.println("�Է��� �� ���� 60���� �Ѵ´ٸ� �ð����� ����Ͻÿ�.\n���� �ð��� 24�ð��� �Ѵ´ٸ� �Ϸ� ���");
		System.out.print("���� �Է��ϼ��� : ");
		int time = sc.nextInt();

		int hour = (time / 60);
		int min = (time % 60);

		if (hour >= 24) {
			// 25�ð��̶�� ġ�� day = 1�̰� hour = 1�ð�
			int day = (hour / 24);
			hour = (hour%24);
			System.out.println("����ð��� " + day + "�� " + hour + "�ð�" + min + "�� �Դϴ�.");
		} else {
			System.out.println("���� �ð��� " + hour + "�ð� " + min + "�� �Դϴ�.");
		}

	}
	public static void test1() {
		int time = r.nextInt(2000)+1;
		while(true) {
			System.out.println(time + "�� ���ҽ��ϴ�.");
			int input = sc.nextInt();
			System.out.println(input + "���� ����Ǿ����ϴ�.");
			//���� ���þ�
		}
	}
	
	public static void test2() {
			//�ζ� ����� �ټ��� ����ϱ�
		
		}
}
