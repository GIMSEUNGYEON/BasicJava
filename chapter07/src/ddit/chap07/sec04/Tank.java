package ddit.chap07.sec04;

public class Tank  extends Unit{
	Tank(int x, int y) {
		super(x,y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)���� (%d, %d)�� �����ؼ� �̵�", 
							x, y, (x + x1), (y + y1));

	}
	void siegeMode() {
		System.out.println("������");
	}
}
