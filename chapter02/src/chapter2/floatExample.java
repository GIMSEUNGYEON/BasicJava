package chapter2;

public class floatExample {

	public static void main(String[] args) {
		float f1 = 3.14f;
		float f2 = 0.1f;
		double d1 = 3.14;
		double d2 = 0.1;
		double d3 = f2;
	
		
		if(f2==d2) {
			System.out.println("���� ũ���� ���̴�");
		}else {
			System.out.println("�ٸ� ũ���� ���̴�");
			System.out.println("d3 : "+ d3);
			
		}
	}

}
