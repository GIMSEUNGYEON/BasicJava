package basicJava;

public class test {
	public static void main(String[] args) {
		test t = new test();
		//t.test02();
		t.test03();
	}
	void test02 () {
		System.out.println("�̷��� �ϴ°� �³�");
	}
	void test03() {
		String str1 = new String("ȫ�浿"); // �������� ����
		String str2 = ("ȫ�浿"); // �������� �̹� �ִ��� �޼ҵ� ������ ���Ӱ� ����
		if(str1.contentEquals(str2)) { // ����� ���ڿ� �� ��ü�� ��
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		if(str1==str2) { // ����� �ּҰ� ������ ���
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
