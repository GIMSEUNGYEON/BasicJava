package ddit.chap07.sec01;

public class ShapeExample {
	public static void main(String[] args) {
		Circle cc = new Circle("원", 3.3);
		// 또는 괄호 자리를 비워둔 후(비우면 그냥 null이랑 0.0으로 초기화되기 때문
		// cc.kind = "원"; cc.radius = 3.3; 일케 넣어도 됨
		Triangle tr = new Triangle("삼각형", 5, 8);
		Rectangle re = new Rectangle("사각형", 4, 2);
		cc.getArea();
		tr.getArea();
		re.getArea();
		// 만약 Rectangle 클래스에서 getArea를 재정의하지 않았다면
		// re.getArea를 통해 호출되는건 부모클래스의 getArea

		// 근데 재정의하고 나서 부모의 getArea를 부르려면 어떻게 해야하지?
		// 자식 클래스의 메소드에서 부모 메소드를 부른 다음 출력 클래스에서 자식 메소드를 부르면
		// 같이 불린다
		// 이 방법 밖에 없남
		// 아니 근데 부모 클래스도 객체로 만들면 그쪽이 불리겠지
		Shape s = new Shape("사각형");
		s.getArea();
		// 그래 이렇게 다른 도형 만들려면 걍 객체를 여러번 만드는 수밖에
	}
}
