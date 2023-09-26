package ddit.chap07.sec04;

public abstract class GraphicalObject {
	int x, y;

	void moveTo(int newX, int newY) {
		System.out.println("newX, newY로 이동하다");
	}

	abstract void draw();

	abstract void resize();
}

class Circle extends GraphicalObject {
	@Override
	void draw() {
		System.out.println("원을 그리다");
	}

	@Override
	void resize() {

	}

}

class Line extends GraphicalObject {
	@Override
	void draw() {

	}

	@Override
	void resize() {

	}
}
//오버라이드는 생략 가능, 쓰는게 원칙, 될수있으면 재정의했다는걸 알려주기