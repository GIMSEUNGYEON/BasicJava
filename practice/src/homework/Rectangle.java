package homework;

public class Rectangle {
	Point p;			//������ ��ǥ��
	int width, height;  //���� �غ��� ���̿� ����

	Rectangle(Point p, int width, int height) {//������
		this.p = p;
		this.width = width;
		this.height = height;
	}

	Point getPoint() {			//������ ����� ��ǥ��
		int x1 = p.x + width;	//������ ��� ��ǥ�� x
		int y1 = p.y + height;	//������ ��� ��ǥ�� y
		return new Point(x1, y1);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}