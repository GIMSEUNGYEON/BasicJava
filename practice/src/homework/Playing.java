package homework;

import java.util.Scanner;
import java.util.Random;

public class Playing {
	public static void main(String[] args) {
		// ���������� ����
		Scanner sc = new Scanner(System.in);
		int user;
		do {
			System.out.println("1. ���� 2. ����  3. ��");
			user = sc.nextInt();
		} while (user != 1 && user != 2 && user != 3);

		if (user == 1) {
			System.out.println("user : ����");
		} else if (user == 2) {
			System.out.println("user : ����");
		} else {
			System.out.println("user : ��");
		}
		Random r = new Random();
		int computer = r.nextInt(3) + 1;
		if (computer == 1) {
			System.out.println("computer : ����");
		} else if (computer == 2) {
			System.out.println("computer : ����");
		} else {
			System.out.println("computer : ��");
		}

		if ((user - computer) == -2 || (user - computer) == 1) {
			System.out.println("user win");
		} else if ((user - computer) == 2 || (user - computer) == -1) {
			System.out.println("computer win");
		} else {
			System.out.println("�����ϴ�.");
		}
	}
}