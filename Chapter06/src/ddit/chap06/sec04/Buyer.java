package ddit.chap06.sec04;

public class Buyer {
	String items;
	int sum;
	int getBonus;
		
	public void buy(Tv t) {
		items += t.toString() + ","; // 메소드 toString에서 반환한 gName이 들어옴
		sum += t.price;
		getBonus += t.bonusPoint;
	}
	
	public void buy(Audio a) {
		items += a + ","; // 메소드 toString에서 반환한 gName이 들어옴
		sum += a.price;
		getBonus += a.bonusPoint;
	}
	public void buy(Computer c) {
		items += c + ","; // 메소드 toString에서 반환한 gName이 들어옴
		sum += c.price;
		getBonus += c.bonusPoint;
	}
	
	public void summary(){
		System.out.println("구매목록 : " + items );
		System.out.println("구매금액 : " + sum );
		System.out.println("얻은 포인트 : " + getBonus );
	}
}
