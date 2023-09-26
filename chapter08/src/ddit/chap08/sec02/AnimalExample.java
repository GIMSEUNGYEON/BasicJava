package ddit.chap08.sec02;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Dog(); //upcast
		//��ĳ��Ʈ�� ��� �θ� ������ ������ �� �־ �۸��� ���������� �ٿ�ĳ��Ʈ �ؾ���
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println(dog.name);
		}
		
				
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
		}else {
		System.out.println("�ٿ�ĳ��Ʈ �Ұ���");
		}
	}
}

abstract class Animal{
	
}

class Dog extends Animal{
	String name = "�۸���";
}

class Cat extends Animal{
	
}
