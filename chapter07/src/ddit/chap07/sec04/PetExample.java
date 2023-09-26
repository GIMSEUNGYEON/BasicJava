package ddit.chap07.sec04;

public class PetExample {
	public static void main(String[] args) {
		Dog d1 = new Dog(7, "향단이");
		d1.work();
		d1.eat();
		System.out.println("나이 : " + d1.age);
		
		Pet p = new Dog(5, "멍멍이");
		p.eat();
		p.work();
		System.out.println("나이 : " + p.age);
		Pet r1 = new Rabbit();
		r1.work();
		r1.eat();
		System.out.println("\n나이 : " + r1.age);
		
	}
}
