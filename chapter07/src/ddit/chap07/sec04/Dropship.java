package ddit.chap07.sec04;

public class Dropship extends Unit {
	Dropship() {
		super(0,0);
	}
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)���� (%d, %d)�� �����Ͽ� �̵�\n", x, y, (x + x1), (y + y1));

	}
	
	void loadUnload() {
		System.out.println("ž���ϴ�");
	}
}
