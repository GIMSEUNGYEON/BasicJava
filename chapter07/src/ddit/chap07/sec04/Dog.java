package ddit.chap07.sec04;

public class Dog extends Pet {
	String name;
	
	Dog(int age, String name){
		super(age);
		this.name = name;
	}
	@Override
	void work() {
		System.out.printf("%s�� �׹߷� �ȴ´�\n", name);
	}

	@Override
	void eat() {
		System.out.printf("%s�� ��������Ḧ �Դ´�\n", name);
	}

}
