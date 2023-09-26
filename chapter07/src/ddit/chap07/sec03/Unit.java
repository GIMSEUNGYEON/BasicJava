package ddit.chap07.sec03;

interface Repairable{}

public class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int Hp){
		MAX_HP = Hp;
	}
}

class GroundUnit extends Unit {

	GroundUnit(int Hp) {
		super(Hp);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString(){
		return "탱크";
	}
}
class Marrine extends GroundUnit{
	Marrine() {
		super(50);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString(){
		return "해병";
	}
}
class SCV extends GroundUnit{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리가 완료되었습니다.");
		}
	}
	@Override
	public String toString(){
		return "수리공장";
	}
}
class AirUnit extends Unit implements Repairable{

	AirUnit(int Hp) {
		super(Hp);
	}
}

class Dropship extends AirUnit implements Repairable{

	Dropship() {
		super(125);
	}
	@Override
	public String toString() {
		return "수송선";
	}
	
}
