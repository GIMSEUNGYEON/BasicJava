package homework;

public class CylinderExample {
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("������ ���� : " + cd.getVolume());
	}
}
