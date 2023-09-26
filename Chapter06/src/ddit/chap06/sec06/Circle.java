package ddit.chap06.sec06;

public class Circle extends Shape {
	// 클래스 상속
	final double PI = 3.1415926;
	int radius;

	public static void main(String[] args) {
		Circle cc = new Circle("원", 3);
		cc.getArea(); // 자식 클래스 getArea 출력

	}

	Circle(String kind, int radius) {
		super(kind);
		this.radius = radius;
	}

	@Override
	public void getArea() {
		double area = PI * radius * radius;
		System.out.println(kind + "의 넓이 : " + area);
	}
}
