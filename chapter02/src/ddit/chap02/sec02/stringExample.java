package ddit.chap02.sec02;

public class stringExample {
	public static void main(String[] args) {
		// String : java api ���� �����ϴ� ���ڿ� ��ü.
		// ���ڿ��� " " �ȿ� ����� ������
		// ���ڿ��� ���Ǵ� "+"�����ڴ� ���ڿ� ������ �ǹ�
		// any type + ���ڿ� => ���ڿ� + ���ڿ��� ��ȯ��
		String str = "77";
		int a = 7;
		System.out.println(str + a);
		// 777 ���
		boolean b = (12 > 14);
		System.out.println(str + b);
		// 77false ���

		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		boolean bo = (str1 == str2);
		System.out.println(bo);

		String str3 = new String("ȫ�浿");
		boolean boo = (str1 == str3);
		System.out.println(boo);

		boolean bool = str1.equals(str3);
		System.out.println(bool);
		
	}
}
