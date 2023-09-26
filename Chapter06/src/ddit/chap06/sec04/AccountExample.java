package ddit.chap06.sec04;

public class AccountExample {
	public static void main(String[] args) {
		Account2 a2 = new Account2();
		Account2 a3 = new Account2();
		System.out.println("ù��° ������ �ּ� : " + a2);
		System.out.println("�ι�° ������ �ּ� : " + a3);
		//���� �ٸ� �ּ� ��µ�
		// �̷��� �ۼ��� ��� �Ű������� ���� ������
		// �Ű������� �������� ���� 10�� ���� ���� ȣ���
		// Ŭ���� ��ü�� ���ʷ� �������� �� ���ʿ� �뷱���� ���� null �� 0.0���� �ʱ�ȭ�ȴ�.
		a2.setOwner("ȫ�浿");
		a2.setBalance(1000);
		// �̶� �̸� ������ ���ͷ� �����̺� ������ �ҷ����� ���ϴ� ������ �ʱ�ȭ�Ҽ� ������
		// ��� �ʱ�ȭ�� ���� ���Ͱ� �޾� �ʱ�ȭ�� ���� ��ü�� ���� Ŭ������ ������ ����� �� �ִ�.
		// ���ʹ� �Է��� ���� ����ؾ��ϴϱ� ���� �����߰����� ���ʹ� �׳� ������ �ΰ� �̻� �Է��ص� ����
		a2.deposit(100000);
		printAccount2Info(a2);
		a2.withDraw(5000);
		printAccount2Info(a2);
	}

	public static void printAccount2Info(Account2 a2) {
		System.out.println("������ : " + a2.getOwner());
		System.out.println("���� �ܰ� : " + a2.getBalance());
		System.out.println("---------------------------------");
	}
}