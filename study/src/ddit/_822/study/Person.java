package ddit._822.study;

import java.util.Scanner;

public class Person {
	String name = "";
	int money = 10000;
	int[][][] bundle;

	public static void main(String[] args) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ��� �Է��ϼ��� : ");
		person.buyLotto(sc.nextInt()); // ��ȣ �� ���ڰ� num

	}

	public void buyLotto(int num) {
		System.out.println("�Է� ���� ���� ���� ���� ���� �� �� " + "�Է� ���� ���� ũ�ٸ� �� �� ����. " + "����ϴٸ� ������ ���� �ζ� Ŭ������ �̿� �ζ� ���Ÿ� ����"
				+ "���� Ŭ������ ������ ��");
		System.out.println("���� 1000�� ������ �Է� ���� ��");
		Lotto lotto = new Lotto();

		if (money < num) {
			System.out.println("���� ���� ���� " + money + "������ " + num + "����ŭ�� �ζǸ� �� �� �����ϴ�.");
			return;
		} else {
			money -= num;
			bundle = lotto.buyLottoBundle(num / 1000);
			lottoPrint();
		}
	}

	public void lottoPrint() {
		Lotto lotto = new Lotto();
		lotto.printLotto(bundle);
		System.out.println("�ܾ��� " + money + "���Դϴ�.");
	}
}