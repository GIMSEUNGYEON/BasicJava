package homework;

public class Circle {
	double area;
	public double radius;
	public static double PI = 3.141592;
	// 생성자 구현

	public Circle(double radius) {
		this.radius = radius;
	}


	public double getArea() {
		area = radius * radius * PI;
		return area;
	}



}
