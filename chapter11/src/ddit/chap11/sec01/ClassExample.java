package ddit.chap11.sec01;

public class ClassExample {
	public static void main(String[] args) throws Exception{
		//Ŭ���� ������ ����ϴ� ���
		//1) Object Class�� getClass()�̿�
		String s = new String();
		Class cinfo = s.getClass();
		
		//2) Ŭ���� ���ϸ��� Class ������ ���� �����Ѵ�
		Class cinfo2 = String.class;
		
		//3)Class.forName()�޼ҵ带 ����Ѵ�
		Class cinfo3 = Class.forName("java.lang.String");
	}
	public static void infoPersonClass() throws Exception{
		Person p1 = new Person();
		Class pcls = p1.getClass();
		System.out.println(pcls.getName());
		
		Class pcls1 = Person.class;
		System.out.println(pcls1.getName());
		Class pcls2 = Class.forName("ddit.chap11.sec01.Person");
	}
}

class Person{
	private String name;
	private int age;
	
	Person(){}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}