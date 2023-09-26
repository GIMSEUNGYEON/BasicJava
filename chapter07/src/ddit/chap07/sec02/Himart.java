package ddit.chap07.sec02;

import ddit.chap07.sec02.Buyer;

public class Himart {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Tv t1 = new Tv();
		Product p1 = new Audio();
		
		Buyer buyer = new Buyer(100000);
		buyer.buy(c1);
		buyer.buy(t1);
		buyer.buy(new Computer());
		//p자리에 c1, t1을 넣은 것으로 둘의 클래스를 product로 업캐스팅한것
		//오디오는 구매를 안했으므로 업캐스팅되지 않아 다운캐스팅할 수 없음
		buyer.summary();
		
		
	}
}
