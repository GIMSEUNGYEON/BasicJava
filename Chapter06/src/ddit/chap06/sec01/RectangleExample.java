package ddit.chap06.sec01;

public class RectangleExample {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(70,140);
		r1.width = 7000; //private가 아니기 때문에 외부클래스에서 호출 가능
		r1.getArea();
		
		Rectangle r2 = new Rectangle(100,100);
		r2.getArea();
		
		Rectangle r3 = new Rectangle(10,10);
		r3.getArea();
	}
}
