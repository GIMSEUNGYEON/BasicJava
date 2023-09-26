package ddit.chap06.sec01;

public class Rectangle {
	int width = 500; // 직접 초기화
	int height = 1000;

	// 초기화 블럭
	{
		width = 10; // 두번째로 실행되는 직접초기화
		height = 30;

	}

	// 생성자 메서드 - 다양한 초기화
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

	// 넓이를 계산한 후 출력하는 메소드
	public void getArea() {
		int area =height*width;
		System.out.println("넓이 : " +area);
	}

}
