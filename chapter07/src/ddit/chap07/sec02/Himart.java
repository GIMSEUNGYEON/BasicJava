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
		//p�ڸ��� c1, t1�� ���� ������ ���� Ŭ������ product�� ��ĳ�����Ѱ�
		//������� ���Ÿ� �������Ƿ� ��ĳ���õ��� �ʾ� �ٿ�ĳ������ �� ����
		buyer.summary();
		
		
	}
}
