package ddit.chap07.sec04;

public class Marine2 extends Unit{
	Marine2(int x,int y){
		super(x,y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.printf("(%d, %d)에서 (%d, %d)로 걸어서 이동",
							x, y, (x + x1), (y + y1));

	}
	
	void stimPack() {
		System.out.println("스팀팩을 사용");
	}
}
