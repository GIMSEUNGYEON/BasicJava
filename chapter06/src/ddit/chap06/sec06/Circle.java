package ddit.chap06.sec06;

public class Circle extends Shape {
	// Ŭ���� ���
	final double PI = 3.1415926;
	int radius;

	public static void main(String[] args) {
		Circle cc = new Circle("��", 3);
		cc.getArea(); // �ڽ� Ŭ���� getArea ���

	}

	Circle(String kind, int radius) {
		super(kind);
		this.radius = radius;
	}

	@Override
	public void getArea() {
		double area = PI * radius * radius;
		System.out.println(kind + "�� ���� : " + area);
	}
}
