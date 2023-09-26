package homework;

public class Rectangle {
	Point p;			//원점의 좌표값
	int width, height;  //각각 밑변의 길이와 높이

	Rectangle(Point p, int width, int height) {//생성자
		this.p = p;
		this.width = width;
		this.height = height;
	}

	Point getPoint() {			//오른쪽 상단의 좌표값
		int x1 = p.x + width;	//오른쪽 상단 좌표의 x
		int y1 = p.y + height;	//오른쪽 상단 좌표의 y
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