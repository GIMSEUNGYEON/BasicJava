package ddit.chap07.sec04;

public class PetExample {
	public static void main(String[] args) {
		Dog d1 = new Dog(7, "�����");
		d1.work();
		d1.eat();
		System.out.println("���� : " + d1.age);
		
		Pet p = new Dog(5, "�۸���");
		p.eat();
		p.work();
		System.out.println("���� : " + p.age);
		Pet r1 = new Rabbit();
		r1.work();
		r1.eat();
		System.out.println("\n���� : " + r1.age);
		
	}
}
