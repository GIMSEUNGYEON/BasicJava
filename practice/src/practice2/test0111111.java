package practice2;

public class test0111111 {
	public static void main(String[] args) {
		StringClassTest01 s = new StringClassTest01("ȫ�浿", "������", "010-1111-2222");
		s.infoDisplay();
		System.out.println();
		//toString() �޼ҵ�� ��ü�� ���ڿ��� ǥ���� ���� �����Ѵ�.
		StringClassTest01 s1 = new StringClassTest01("������", "���ʱ�", "010-3333-4444");
		System.out.println(s1);
	}
}
