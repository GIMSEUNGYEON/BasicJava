package practice3;

public class SuperTest1 {
	public static void main(String[] args) {
		Parents p = new Parents();
		p.parentInfo();
		//Parent클래스로부터 객체 생성, 부모 클래스에서 선언한 변수만 끌려옴
		
		Child c = new Child();
		c.childInfo();
		//차일드 클래스로부터 객체 생성, 차일드 클래스에서 재정의한 부모클래스의 변수와
		//차일드 클래스에서 선언한 변수가 끌려옴
		
	}
}
