package chapter03;

public class binaryOperator02 {
		public static void main(String[] args) {
			 //bitwiserOperator();
			 //shiftOperator();
			 assignmentOperator();
		}
		public static void bitwiserOperator() {
			//|, &, ^(exclusive-or)
			//��Ʈ ������ �������� ���ڰ����� ��ȯ�Ǵ� ������
			int num1 = 34;
			int num2 = 19;
			System.out.println("&(��Ʈ�� and) = " + (num1 & num2));
			System.out.println("|(��Ʈ�� or) = " + (num1 | num2));
			System.out.println("^(��Ʈ�� ex-or) = " + (num1 ^ num2));
		}
		
		public static void shiftOperator() {
			// >>(right shift),<<(left shift), >>>(logical right shift)
			int num1 = 17;
			int num2 = -17;
			System.out.println("num1>>2 = " + (num1>>2));
			System.out.println("num1<<2 = " + (num1<<2));
			System.out.println("num2>>>2 = " + (num2>>>2));
			
		}
		public static void assignmentOperator() {
			//=���� �̰� �ϳ���
			//���� �Ҵ� �����ڶ�� +=, -=, *=, /=, %=�� ���տ����ڶ���Ѵ�
			//������� ���°� ����1 = ����1 + ���� �� �� �� ������ ����1 +=���ڷ� ������ִ� ������ �Ѵ�
			//�� �Ŀ��� ���� 1�� ���꿡 �����ϴ� ���ÿ� ����� ����ϴ� ������ ������ ���ÿ� �����Ѵ�
			int sum = 0;
			for(int i = 0; i<1000; i++) { 
				sum += i;
				
			}
		}
}
