package selfStudies;

public class integer {
  public static void main(String[] args) {
	  float var = 3.14f;
		double var1 = 3.14;
		System.out.println(var);
		int a ='A';
		System.out.println(a);
		
		byte res = 127;
		System.out.println(++res); // 128�� �Ǿ���ϴµ� ǥ������ ���ϹǷ� -128�� ǥ����
		//���Ŀ� ���� ��������� �ʰ��� ��쿣 ��ȯ���� �ȴ� 
		
		short sh1 = 200;
		//short sh2 = sh1 + 10; //���� �߻� �ڵ�
		short sh2 = 10;
		short sh3 = (short)(sh1 + sh2);
		System.out.println((short)(sh1+sh2));
intInteger();
longInteger();
  }
  public static void intInteger() {
	  // int : 4byte ����
	  int num = 200;
	  int res = 1000000*1000000;
	  System.out.println("res : " + res); //��ȯ ��� ���
	  
}
  public static void longInteger() {
	  //long : 8byte
	  long num = 100L;
	  long res1 = 1000000 * 1000000;
	  long res2 = 1000000l * 1000000l;
	  
	  System.out.println(res1);
	  System.out.println(res2);
  }
}