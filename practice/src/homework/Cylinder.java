package homework;

public class Cylinder {
	double height;
	double volume;
	Circle cc;

	Cylinder(Circle cc, double height) {
		this.cc = cc;
		this.height = height;

	}

	public double getVolume() {
		volume = cc.getArea() * height;
		return volume;
	}
}
