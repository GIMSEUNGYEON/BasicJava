package ddit.chap07.sec01;

public class Shape {
	String kind;
	
	Shape(String kind){
		this.kind = kind;
	}
	Shape(){}
	
	public void getArea(){
		System.out.println("������ ���� : " + kind);
	}
	
	@Override
	public String toString() {
		return kind;
	}
}
