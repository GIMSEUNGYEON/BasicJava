package ddit.chap06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		System.out.println("�й� : " + Student.stdID);

		Student s1 = new Student();
//		s1.major = "����Ʈ�����а�";
		System.out.println("�а� : " + s1.major);
		System.out.println("�й� : " + Student.stdID);
		
		Student s2 = new Student();
//		s2.major = "��ǻ�� ���а�";
		
		System.out.println("�а� : " + s2.major);
		System.out.println("�й� : " + Student.stdID);
	}
}
