package ddit.chap07.sec01;

public class Circle extends Shape {
	double radius;
	final double PI = 3.141592;

	Circle(String kind, double radius) {
		super(kind);
		this.radius = radius;
	}
	Circle(){
		super();
	}
	//자식 클래스에서 기본생성자가 있기 위해선 부모 클래스에서도 기본생성자가 있어야한다

	@Override
	public void getArea() {
		double area = PI * radius * radius;
		System.out.println(kind + "의 넓이 : " + area);
	}
}
