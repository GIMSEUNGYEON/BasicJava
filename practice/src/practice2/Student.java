package practice2;

public class Student {
	String name;
	int age;
	String hobby;
	public Student(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public void studentInfoDisplay() {
		System.out.printf("이름 : %s, 나이 : %d세, 취미 : %s\n", name, age, hobby);
		
	}
}
