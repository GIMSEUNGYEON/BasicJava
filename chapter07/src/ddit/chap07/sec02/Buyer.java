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
			System.out.println("�ܾ� ����");
		}
		Computer c = (Computer)p;
		//instanceOf ������ ���
		
		System.out.println(p + "�� ���� : " + c.price);
		
	}
	void summary() {
		System.out.printf("���� ��� : %s\n���� �ݾ� �հ� : %d\n���� �ݾ� : %d\nȹ�� ����Ʈ : %d", items, sum, money, getBonus);
	}
}