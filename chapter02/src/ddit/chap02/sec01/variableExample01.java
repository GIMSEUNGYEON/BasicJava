package ddit.chap02.sec01;
public class variableExample01 {
	static int sum; 	
	public static void main(String[] args) {
		int score = 89; //���� ����
		//sum = sum + score;
		sum+=score;
	System.out.println(sum);
	/*
	 * static int sum�� ���ο��� �ȿ� ������ �ʱ�ȭ���� ���� sum�� �������� ���ϴµ�  
	 * ���� ���� �ۿ��� ���ǵ� ������ �� �ʱ�ȭ���� �ʾƵ� ������ �Ǵ��� �𸣰���
	 * +=�� =+�� ����?
	 */
	String a = new String("�ſ��");
	System.out.println(a);
	String b = new String("�ſ��");
	boolean t = a.equals(b);
	System.out.println(t); //true ���
	
	System.out.println(a == b);//false ���
	
	String aa = "�ſ��"; //new
	System.out.println(a == aa);	
	}
}
