package homework;

import java.util.Scanner;
import java.util.Random;

public class Playing {
	public static void main(String[] args) {
		// 가위바위보 구현
		Scanner sc = new Scanner(System.in);
		int user;
		do {
			System.out.println("1. 가위 2. 바위  3. 보");
			user = sc.nextInt();
		} while (user != 1 && user != 2 && user != 3);

		if (user == 1) {
			System.out.println("user : 가위");
		} else if (user == 2) {
			System.out.println("user : 바위");
		} else {
			System.out.println("user : 보");
		}
		Random r = new Random();
		int computer = r.nextInt(3) + 1;
		if (computer == 1) {
			System.out.println("computer : 가위");
		} else if (computer == 2) {
			System.out.println("computer : 바위");
		} else {
			System.out.println("computer : 보");
		}

		if ((user - computer) == -2 || (user - computer) == 1) {
			System.out.println("user win");
		} else if ((user - computer) == 2 || (user - computer) == -1) {
			System.out.println("computer win");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}