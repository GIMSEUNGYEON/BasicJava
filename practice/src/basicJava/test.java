package basicJava;

public class test {
	public static void main(String[] args) {
		test t = new test();
		//t.test02();
		t.test03();
	}
	void test02 () {
		System.out.println("이렇게 하는게 맞나");
	}
	void test03() {
		String str1 = new String("홍길동"); // 힙영역에 저장
		String str2 = ("홍길동"); // 힙영역에 이미 있더라도 메소드 영역에 새롭게 생성
		if(str1.contentEquals(str2)) { // 저장된 문자열 그 자체를 비교
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		if(str1==str2) { // 저장된 주소가 같은지 물어봄
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
