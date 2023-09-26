package ddit.chap07.sec02;

public class Buyer {
	int money;
	int getBonus;
	String items = "";
	int sum;

	Buyer(int money) {
		this.money = money;
	}

	void buy(Product p) {
		if(money >= p.price) {
		sum += p.price;
		getBonus += p.bonusPoint;
		items += p + ",";
		money-=p.price;
		}else {
			System.out.println("잔액 부족");
		}
		Computer c = (Computer)p;
		//instanceOf 연산자 사용
		
		System.out.println(p + "의 가격 : " + c.price);
		
	}
	void summary() {
		System.out.printf("구매 목록 : %s\n구매 금액 합계 : %d\n남은 금액 : %d\n획득 포인트 : %d", items, sum, money, getBonus);
	}
}