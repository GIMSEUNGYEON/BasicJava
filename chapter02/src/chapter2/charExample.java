package chapter2;

public class charExample {
	public static void main(String[] args) {
		char c ='¾É';
		System.out.println((int)c);
		System.out.println(c+1);
		int i = 'Ä˜';
		System.out.println(i);
		System.out.println(i+1);
		System.out.println(c+i);
		
		
		//ABCD ... Z Ãâ·Â
		char cha;
		for(cha = 'A'; cha<='Z'; cha++) {
			System.out.print(cha);
		}
		System.out.println();
		
		for(int in = 65; in <= 90; in++) {
			System.out.print((char)in);
		}
		
		System.out.println();
		byte b1 = -100;
		short s1 = 67;
		
		System.out.println((char)b1);
		
		char c0 = 'a';
		byte b3= (byte)c0;
		System.out.println(b3);
	}
	
}
