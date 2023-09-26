package ddit.chap07.sec04;

public class UnitTest {
	public static void main(String[] args) {
		Unit u = new Dropship();
		u.move(200,350);
		
		Dropship ds1 = null;			
		if(u instanceof Dropship) {
			ds1 = (Dropship)u;			
		}
		
		ds1.loadUnload();
	}
}
