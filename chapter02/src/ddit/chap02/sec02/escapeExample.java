package ddit.chap02.sec02;

public class escapeExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ���";
		String str3 = "������";
		//System.out.println(str1);
		System.out.println(str1 + "�� \n\r�� ģ���Դϴ�.");
		
		System.out.println("---------------------");
		
		//System.out.println(str1 +"\"" +str3+ "\"");
		System.out.println(str1 + "�� \r\n�� ģ���Դϴ�.");
		sequence();
	}
	public static void sequence() {
		System.out.println("\u0041"); // 65
		System.out.println("\u0061"); // 97
		System.out.println("\uAC00"); // 44032
		
	}
}
