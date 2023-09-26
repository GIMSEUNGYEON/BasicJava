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
	//�ڽ� Ŭ�������� �⺻�����ڰ� �ֱ� ���ؼ� �θ� Ŭ���������� �⺻�����ڰ� �־���Ѵ�

	@Override
	public void getArea() {
		double area = PI * radius * radius;
		System.out.println(kind + "�� ���� : " + area);
	}
}
