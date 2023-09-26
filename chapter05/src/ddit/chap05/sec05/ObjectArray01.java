package ddit.chap05.sec05;

public class ObjectArray01 {
	public static void main(String[] args) {
		// ���� ��ǥ�� ǥ���ϴ� Ŭ����(Point)�� �����ϰ� �̸� �̿��Ͽ� �ﰢ��, �簢��, ���� ������ ����Ѵ�.
		Point p1 = new Point(100,200);
		Point p2 = new Point(600,200);
		Point p3 = new Point(350,500);
		
		Point[] point = {new Point(100, 200), new Point(600, 200), new Point(350, 500)};
		Triangle t1 = new Triangle(point);
		//Triangle t1 = new Triangle(new Point(100, 200), new Point(600, 200), new Point(350, 500));
		t1.draw();
	}
}

class Point {
	private int x; // private : �ܺηκ��� �������� ���� Ȥ�� �޼ҵ带 ������ �� ���
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		// Point Ŭ������ ����� �� (Point p = new Point();�� �����Ҷ�)x,y�� ���� ������
		// this : Point Ŭ������ �ּ�(new Point�� �ּ�)
	}

	@Override // ������ �ϰڴ� �������̵嵵 �ּ��ε� �����ϵǴ� �ּ� annotation ???

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

class Triangle {
//	Point p1;
//	Point p2;
//	Point p3;
	Point[] point = new Point[3]; 
	//Ŭ���� Point�� ���� �����ϴ� �迭 point[0][1][2]�� ���� ���� ������ ������� Point p1 = new Point�� ���� �������ش�
	int [] iarray= new int[4];
	
	Triangle(Point [] point) {
		this.point = point;
	}

	public void draw() {
		System.out.println("��" + point[0] + "���� ��" + point[1] + "�� drawLine()���� �����Ѵ�.");
		System.out.println("��" + point[1] + "���� ��" + point[2] + "�� drawLine()���� �����Ѵ�.");
		System.out.println("��" + point[2] + "���� ��" + point[0] + "�� drawLine()���� �����Ѵ�.");
	}
}
