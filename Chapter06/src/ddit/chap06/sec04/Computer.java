package ddit.chap06.sec04;

public class Computer {
	String gName;
	int price;
	int bonusPoint;
	
	Computer(String gName, int price){
		this.gName = gName;
		this.price = price;
		bonusPoint = (int)(price/100);
	}
	@Override
	public String toString() {
		return gName;
		
}
}
