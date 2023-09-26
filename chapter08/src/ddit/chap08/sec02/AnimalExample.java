package ddit.chap08.sec02;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Dog(); //upcast
		//업캐스트된 경우 부모 변수만 참조할 수 있어서 멍멍이 데려오려면 다운캐스트 해야함
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println(dog.name);
		}
		
				
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
		}else {
		System.out.println("다운캐스트 불가능");
		}
	}
}

abstract class Animal{
	
}

class Dog extends Animal{
	String name = "멍멍이";
}

class Cat extends Animal{
	
}
