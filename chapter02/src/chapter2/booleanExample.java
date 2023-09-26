package chapter2;

public class booleanExample {
	public static void main(String[] args) {
		boolean flag = true;
		int num =200;
		String name = "홍길동";
		
		System.out.println(flag);
		
		flag = num>100 && name.equals("홍길동");
		
		System.out.println(flag);
	 
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("객체 내용 비교 : " + p1.equals(p2));
		System.out.println("객체 주소 비교 : " + (p1==p2));
		System.out.println(p1); //저장되어있는 절대 주소값 출력
		System.out.println(p2); //주소값 출력
		
		short s = 1;
		int i = s;
		System.out.println(i);
		
		int ii = 100;
		byte bb = (byte)ii;
		System.out.println(bb);
		
		double d = 0.9;
		double dd = 1.2;
		int id = (int)(d+dd);
		int iii = (int)d + (int)dd;
		System.out.println(id);
		System.out.println(iii);
		practice();
		practice2();
	}
	public static void practice() {
		char c = 'A';
		int i = (int)c;
		System.out.println(c);
		System.out.println((int)c);
		
			
		System.out.println("헷갈려서 잘랐습니다");
		System.out.println(i);
		int ii = (char)'A';
		System.out.println(ii);
		
		System.out.println();
		
		int iii = 'A';
		System.out.println(iii);
		
		char cc = 65;
		System.out.println(cc);
		System.out.println((int)cc);
	}
	
	public static void practice2() {
		
		System.out.println();
		String s = "확인했습니다";
		System.out.println(s);
		String ss = new String("확인했습니다");
		System.out.println(ss);
		if(s==ss) {
			System.out.println("이해하다");
		}
		else {
			System.out.println("이해 못하다");
		}
		System.out.println("구분선");
		String w = "why";

		String y = "why";

		if(w==y) { 

		System.out.println("같다");
		}
		else {
		System.out.println("다르다");
		}
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(ss));
		System.out.println(System.identityHashCode(w));
		System.out.println(System.identityHashCode(y));
		System.out.println(s.equals(ss));
	}
	
}


class Person{}