package ddit.chap06.sec04;

public class Buyer {
	String items;
	int sum;
	int getBonus;
		
	public void buy(Tv t) {
		items += t.toString() + ","; // �޼ҵ� toString���� ��ȯ�� gName�� ����
		sum += t.price;
		getBonus += t.bonusPoint;
	}
	
	public void buy(Audio a) {
		items += a + ","; // �޼ҵ� toString���� ��ȯ�� gName�� ����
		sum += a.price;
		getBonus += a.bonusPoint;
	}
	public void buy(Computer c) {
		items += c + ","; // �޼ҵ� toString���� ��ȯ�� gName�� ����
		sum += c.price;
		getBonus += c.bonusPoint;
	}
	
	public void summary(){
		System.out.println("���Ÿ�� : " + items );
		System.out.println("���űݾ� : " + sum );
		System.out.println("���� ����Ʈ : " + getBonus );
	}
}
