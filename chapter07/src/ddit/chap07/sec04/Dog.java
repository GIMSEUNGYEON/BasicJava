package ddit.chap07.sec04;

public class Dog extends Pet {
	String name;
	
	Dog(int age, String name){
		super(age);
		this.name = name;
	}
	@Override
	void work() {
		System.out.printf("%s는 네발로 걷는다\n", name);
	}

	@Override
	void eat() {
		System.out.printf("%s는 강아지사료를 먹는다\n", name);
	}

}
