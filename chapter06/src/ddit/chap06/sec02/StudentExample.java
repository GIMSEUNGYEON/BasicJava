package ddit.chap06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		System.out.println("학번 : " + Student.stdID);

		Student s1 = new Student();
//		s1.major = "소프트웨어학과";
		System.out.println("학과 : " + s1.major);
		System.out.println("학번 : " + Student.stdID);
		
		Student s2 = new Student();
//		s2.major = "컴퓨터 공학과";
		
		System.out.println("학과 : " + s2.major);
		System.out.println("학번 : " + Student.stdID);
	}
}
