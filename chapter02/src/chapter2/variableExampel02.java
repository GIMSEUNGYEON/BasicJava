package chapter2;

public class variableExampel02 {
	
 public static void main(String[] args) {
	 int sum= 0;
	for(int i = 1; i<= 100; i++) {
		sum= sum + i;
		System.out.println(sum);
	}
	
		myMethod();
	}

// ù���� 100��, ��°������ ������ �ι辿 �����Ѵٸ� ���ʷ� 100������ �Ѵ� ���� ��ĥ�� ����� ���̸� �׶������� �ݾ��� �󸶳� �Ǵ°�?
public static void myMethod() {
	int money = 100;
	int sum = 0;
	int days = 0;
	
	while(true) {
		
		
		if (sum>= 1000000) {
			break;
		}
		sum = sum+money;
		money = money*2;
		days++;
	}
		//System.out.println("��� �ϼ� : " + days);
		System.out.println("���� �ݾ� : " + sum);
	

	
}
}