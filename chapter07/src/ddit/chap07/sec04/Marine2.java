package ddit.chap07.sec04;

public class Marine2 extends Unit{
	Marine2(int x,int y){
		super(x,y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)���� (%d, %d)�� �ɾ �̵�",
							x, y, (x + x1), (y + y1));

	}
	
	void stimPack() {
		System.out.println("�������� ���");
	}
}
