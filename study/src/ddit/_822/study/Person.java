package ddit._822.study;

import java.util.Scanner;

public class Person {
	String name = "";
	int money = 10000;
	int[][][] bundle;

	public static void main(String[] args) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 금액을 입력하세요 : ");
		person.buyLotto(sc.nextInt()); // 괄호 안 숫자가 num

	}

	public void buyLotto(int num) {
		System.out.println("입력 받은 돈과 현재 가진 돈을 비교 후 " + "입력 받은 돈이 크다면 살 수 없다. " + "충분하다면 기존에 만든 로또 클래스를 이용 로또 구매를 진행"
				+ "현재 클래스에 저장할 것");
		System.out.println("돈은 1000원 단위로 입력 받을 것");
		Lotto lotto = new Lotto();

		if (money < num) {
			System.out.println("현재 가진 돈은 " + money + "원으로 " + num + "원만큼의 로또를 살 수 없습니다.");
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
		System.out.println("잔액은 " + money + "원입니다.");
	}
}