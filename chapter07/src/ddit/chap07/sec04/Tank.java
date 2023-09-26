package ddit.chap07.sec04;

public class Tank  extends Unit{
	Tank(int x, int y) {
		super(x,y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)에서 (%d, %d)로 운전해서 이동", 
							x, y, (x + x1), (y + y1));

	}
	void siegeMode() {
		System.out.println("시즈모드");
	}
}
