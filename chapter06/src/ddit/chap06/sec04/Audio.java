package ddit.chap06.sec04;

public class Audio {
	String gName;
	int price;
	int bonusPoint;
	
	Audio(String gName, int price){
		this.gName = gName;
		this.price = price;
		bonusPoint = (int)(price/100);
	}
	@Override
	public String toString() {
		return gName;
		
}
}
