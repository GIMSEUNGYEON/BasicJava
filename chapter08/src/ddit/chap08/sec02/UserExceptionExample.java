package ddit.chap08.sec02;
//������ ���� ���� Ŭ����

// Exception class�� ���
// throws ����� �̿��ؼ� ���ܸ� ������ �߻���Ŵ

public class UserExceptionExample {
	public static void main(String[] args) {
		try {
			System.out.println("���� �߻�");
			throw new MyExcetion("����� ���� ����");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

class MyExcetion extends Exception {
	MyExcetion(String errMsg) {
		super(errMsg);
	}
}