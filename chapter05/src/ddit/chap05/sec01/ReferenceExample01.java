package ddit.chap05.sec01;

public class ReferenceExample01 {
	public static void main(String[] args) {
	Person p1 = new Person("ȫ�浿");
		System.out.println("p1="+p1);
		
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		String str4 = new String("ȫ�浿");
		
		if(str1==str2) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");	
		}
		if(str3==str4) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");	
		}
		System.out.println(str3);
		
	}
}

class Person{
	String name;
		Person(String name){
		this.name=name;
			}
	@Override
	public String toString() {
		return name;
	}
}

