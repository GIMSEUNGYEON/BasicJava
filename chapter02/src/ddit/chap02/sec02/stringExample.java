package ddit.chap02.sec02;

public class stringExample {
	public static void main(String[] args) {
		// String : java api 에서 제공하는 문자열 객체.
		// 문자열은 " " 안에 기술된 데이터
		// 문자열에 사용되는 "+"연산자는 문자열 결합을 의미
		// any type + 문자열 => 문자열 + 문자열로 변환됨
		String str = "77";
		int a = 7;
		System.out.println(str + a);
		// 777 출력
		boolean b = (12 > 14);
		System.out.println(str + b);
		// 77false 출력

		String str1 = "홍길동";
		String str2 = "홍길동";
		boolean bo = (str1 == str2);
		System.out.println(bo);

		String str3 = new String("홍길동");
		boolean boo = (str1 == str3);
		System.out.println(boo);

		boolean bool = str1.equals(str3);
		System.out.println(bool);
		
	}
}
