package ddit.chap02.sec02;

public class escapeExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길순";
		String str3 = "정몽주";
		//System.out.println(str1);
		System.out.println(str1 + "은 \n\r내 친구입니다.");
		
		System.out.println("---------------------");
		
		//System.out.println(str1 +"\"" +str3+ "\"");
		System.out.println(str1 + "은 \r\n내 친구입니다.");
		sequence();
	}
	public static void sequence() {
		System.out.println("\u0041"); // 65
		System.out.println("\u0061"); // 97
		System.out.println("\uAC00"); // 44032
		
	}
}
