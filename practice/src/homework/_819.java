package homework;

public class _819 {
	public static void main(String[] args) {

		Example01();
		// Example02();
		// Example03();
		Example04();
	}

	public static void Example01() {
		// �Ǻ���ġ ������ for������ ǥ���ϱ�
		// 0 1 1 2 3 5 8 13 21 34����
		// for(;;)�� �̿��ؼ� ���ѷ����� ����� ������ ���� 50���� Ŀ�� �� break�� �����?
		int sum;
		int a = 0;
		int b = 1;
		for (;;) {
			sum = a + b;
			a = b;
			b = sum;
			if (sum > 50) {
				break;
			}
			System.out.println(sum);
		}
	}

	public static void Example02() {
		// for������ �ݺ��� Ƚ�� �����ϱ�
		int x = 1;
		int y = 1;
		int z = 0;
		for (int i = 0; i < 7; i++) {
			z = x + y;
			x = y;
			y = z;
			System.out.println(z);
		}
	}

	public static void Example03() {
		// �� ���� �� ũ�⸦ �����Ͽ� �ݺ����� ���߱�
		// ���� 50���� Ŀ�� �� �ݺ��� ����
		// sum���� ����� ������ ���� �ݺ����� ���� �����ϱ� ������ x=y=21, y=sum=34�� �Ǿ� sum�� 34�� 
		// �� �� for�� �ݺ��� ���� ����
		int x = 1;
		int y = 1;
		int sum = 0;
		for (; (x + y) < 50;) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.println(sum);
		}
	}

	public static void Example04() {
		// sum�� ���� 55�� �� ���� for������ ���ƿ� ������ false�� �Ǵ°� Ȯ���ϱ� ������ 55���� ��µ�
		
		int x = 1;
		int y = 1;
		int sum = 0;
		for (; sum < 50;) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.println(sum);
		}
	}
}
