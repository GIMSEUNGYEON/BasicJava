package ddit.chap04.sec03;

public class WhileStatementExample01 {
	public static void main(String[] args) {
		// whileMethod01();
		// whileMethod02();
		whileMethod03();
	}

	public static void whileMethod01() {
		int numOfChop = 1;
		while (numOfChop < 10) {
			System.out.println("������ " + numOfChop + "�� ������ϴ�");
			System.out.println("���� �Ѿ�� �ʾҽ��ϴ�.\n");
			numOfChop++;
		}
		System.out.println("������ " + numOfChop + "�� ������ϴ�");
		System.out.println(numOfChop + "�� ��� �ȳѾ�� ���� ����");
	}

	public static void whileMethod02() {
		int a = 1;
		int b = 1;
		int sum = 0;
		System.out.printf("%2d,  %2d,  ", a, b);
		while (sum < 50) {
			sum = a + b;
			if (sum < 50) {
				System.out.printf("%2d,  ", sum);
			} else {
				break;
			}
			a = b;
			b = sum;
		}
	}

	public static void whileMethod03() {
		// ������ 100��, ���Ϻ��� �ι辿 �����Ҷ� 100������ ���� ���̳�?
		int i = 100;
		int sum = 0;
		int days = 0;
		while (true) {
			if (sum < 1000000) {
				sum += i;
				i *= 2;
				days++;
			} else {
				break;
			}
			System.out.println("���� �� : " + sum + "\t ����ϼ� : " + days);
		}
	}
}
