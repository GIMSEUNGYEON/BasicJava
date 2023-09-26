package ddit.chap05.sec05;

public class ObjectArray01 {
	public static void main(String[] args) {
		// 점의 좌표를 표현하는 클래스(Point)를 생성하고 이를 이용하여 삼각형, 사각형, 원의 정보를 출력한다.
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
	private int x; // private : 외부로부터 독립적인 변수 혹은 메소드를 생성할 때 사용
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		// Point 클래스가 실행될 때 (Point p = new Point();로 생성할때)x,y가 같이 존재함
		// this : Point 클래스의 주소(new Point의 주소)
	}

	@Override // 재정의 하겠다 오버라이드도 주석인데 컴파일되는 주석 annotation ???

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

class Triangle {
//	Point p1;
//	Point p2;
//	Point p3;
	Point[] point = new Point[3]; 
	//클래스 Point의 값을 저장하는 배열 point[0][1][2]를 만들어서 제일 위에서 만들어준 Point p1 = new Point를 각각 저장해준다
	int [] iarray= new int[4];
	
	Triangle(Point [] point) {
		this.point = point;
	}

	public void draw() {
		System.out.println("점" + point[0] + "에서 점" + point[1] + "를 drawLine()으로 연결한다.");
		System.out.println("점" + point[1] + "에서 점" + point[2] + "를 drawLine()으로 연결한다.");
		System.out.println("점" + point[2] + "에서 점" + point[0] + "를 drawLine()으로 연결한다.");
	}
}
