package homework;

public class CylinderExample {
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("원통의 부피 : " + cd.getVolume());
	}
}
