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
		System.out.printf("%25s\n", "메뉴");
		System.out.println("--------------------------");
		for (Hamburger burger : ham) {
			//개선된 for문 타입 변수 : 배열명 
			System.out.printf("%10s : %4d원 \n", burger, burger.getPrice());
		}
		System.out.println("--------------------------");
	}
}
