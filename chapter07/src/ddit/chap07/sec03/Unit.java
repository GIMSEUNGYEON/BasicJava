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
		return "��ũ";
	}
}
class Marrine extends GroundUnit{
	Marrine() {
		super(50);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString(){
		return "�غ�";
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
			System.out.println(u + "�� ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	@Override
	public String toString(){
		return "��������";
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
		return "���ۼ�";
	}
	
}
