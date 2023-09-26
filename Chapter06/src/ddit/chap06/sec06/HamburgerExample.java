package ddit.chap06.sec06;

enum Hamburger {
	CHICKEN(5000), BIGMAC(4500), CHEESE(5000);

	private final int price;

	private Hamburger(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}

public class HamburgerExample {
	public static void main(String[] args) {
		Hamburger[] ham = Hamburger.values();
		System.out.printf("%25s\n", "�޴�");
		System.out.println("--------------------------");
		for (Hamburger burger : ham) {
			//������ for�� Ÿ�� ���� : �迭�� 
			System.out.printf("%10s : %4d�� \n", burger, burger.getPrice());
		}
		System.out.println("--------------------------");
	}
}
