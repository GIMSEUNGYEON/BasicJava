package ddit.chap07.sec04;

public class Rabbit extends Pet {
	Rabbit(){
		super(3);
	}
	@Override
	void work() {
		System.out.println("±øÃÑ±øÃÑ ¶Ú´Ù");
	}

	@Override
	void eat() {
		System.out.printf("%d»ì Åä³¢´Â Ç®À» ¸Ô´Â´Ù", age);
	}

}
