package ddit.chap07.sec02;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = price/100;
	}

}
