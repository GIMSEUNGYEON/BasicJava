package ddit.chap07.sec01;

public class Triangle extends Shape {
	double width;
	double height;

	Triangle(String kind, double width, double height) {
		super(kind);
		this.width = width;
		this.height = height;
	}

	@Override
	public void getArea() {
		double area = (height * width)/2;
		System.out.println(kind + "¿« ≥–¿Ã : " + area);

	}
}
