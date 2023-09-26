package selfStudies;

public class homework {

	public static void main(String[] args) {
		byte b = 127;
		byte b2 = 3;
		byte c = (byte)(b + b2);
		System.out.println("byte : \n" );
		// byte의 허용 범위를 벗어나기 때문에 순환 적용되어 130은 -126으로 표기된다
		short s = 256;
		System.out.println("short : " + s );
		int i = 47;
		System.out.println("int : " + i );
		long l = 43121053234234L; // 자바의 기본형은 int로 지정되어 있기 때문에 int의 허용 범위 밖의 큰 숫자는 L를 붙여 컴파일 한다
		System.out.println("long : \r" + l );
	    double a = 0.12e-2;
	    System.out.println("aa\rbb\ncc");
		
	
	}
	
	}
	
