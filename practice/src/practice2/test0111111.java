package practice2;

public class test0111111 {
	public static void main(String[] args) {
		StringClassTest01 s = new StringClassTest01("홍길동", "강남구", "010-1111-2222");
		s.infoDisplay();
		System.out.println();
		//toString() 메소드는 객체를 문자열로 표현한 값을 리턴한다.
		StringClassTest01 s1 = new StringClassTest01("조정석", "서초구", "010-3333-4444");
		System.out.println(s1);
	}
}
