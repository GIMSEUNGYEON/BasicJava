package ddit.chap07.sec03;

public class PolyTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marrine m = new Marrine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(m);
		// 해병엔 implement를 안 해서
		
	}
}
