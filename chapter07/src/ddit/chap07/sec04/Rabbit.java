package ddit.chap07.sec04;

public class Rabbit extends Pet {
	Rabbit(){
		super(3);
	}
	@Override
	void work() {
		System.out.println("���ѱ��� �ڴ�");
	}

	@Override
	void eat() {
		System.out.printf("%d�� �䳢�� Ǯ�� �Դ´�", age);
	}

}
