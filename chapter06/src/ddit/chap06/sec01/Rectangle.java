package ddit.chap06.sec01;

public class Rectangle {
	int width = 500; // ���� �ʱ�ȭ
	int height = 1000;

	// �ʱ�ȭ ��
	{
		width = 10; // �ι�°�� ����Ǵ� �����ʱ�ȭ
		height = 30;

	}

	// ������ �޼��� - �پ��� �ʱ�ȭ
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

	// ���̸� ����� �� ����ϴ� �޼ҵ�
	public void getArea() {
		int area =height*width;
		System.out.println("���� : " +area);
	}

}
