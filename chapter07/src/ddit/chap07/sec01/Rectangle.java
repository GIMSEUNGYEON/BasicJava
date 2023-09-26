package ddit.chap07.sec01;

public class Rectangle extends Shape {
	double garo;
	double sero;

	Rectangle(String kind, double garo, double sero) {
		super(kind);
		this.garo = garo;
		this.sero = sero;
	}

	@Override
	public void getArea() {
		double area = garo * sero;
		System.out.println(kind + "¿« ≥–¿Ã : " + area);
		super.getArea();
	}
}
