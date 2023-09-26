package ddit.chap06.sec04;

public class BuyerExample {
	public static void main(String[] args) {
		Tv t1 = new Tv("LG tv", 5000);
		Tv t2 = new Tv("Samsung tv", 7500);
		Audio a1 = new Audio("Inkel", 2500);
		Computer c1 = new Computer("LG gram", 1200);
		Computer c2 = new Computer("Samsung NoteBook", 1500);
		Computer c3 = new Computer("Mac Pro", 2000);
		
		Buyer b1 = new Buyer();
		b1.buy(c2);
		b1.buy(c3);
		b1.buy(t2);
		
		b1.summary();
		
		
	}
}
