package ddit.chap07.sec04;

public abstract class Pet {
	int age;
	abstract void work();
	abstract void eat();
	
	Pet(int age){
		this.age = age;
	}
	void run() {
		System.out.println("´Þ¸®´Ù");
	}
	
}
