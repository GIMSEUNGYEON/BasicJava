package ddit.chap06.sec06;

public class Shape {
	String kind;
	
	Shape(String kind){
		this.kind = kind;
	}
	public void getArea() {
		System.out.println("도형의 종류 : " + kind);
	}
}
