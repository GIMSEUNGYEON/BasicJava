package ddit.chap07.sec04;

public abstract class GraphicalObject {
	int x, y;

	void moveTo(int newX, int newY) {
		System.out.println("newX, newY�� �̵��ϴ�");
	}

	abstract void draw();

	abstract void resize();
}

class Circle extends GraphicalObject {
	@Override
	void draw() {
		System.out.println("���� �׸���");
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
//�������̵�� ���� ����, ���°� ��Ģ, �ɼ������� �������ߴٴ°� �˷��ֱ�