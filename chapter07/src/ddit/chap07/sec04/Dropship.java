package ddit.chap07.sec04;

public class Dropship extends Unit {
	Dropship() {
		super(0,0);
	}
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)에서 (%d, %d)로 비행하여 이동\n", x, y, (x + x1), (y + y1));

	}
	
	void loadUnload() {
		System.out.println("탑승하다");
	}
}
