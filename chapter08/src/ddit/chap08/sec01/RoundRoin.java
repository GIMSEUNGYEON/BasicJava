package ddit.chap08.sec01;

public class RoundRoin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ��� ��ȭ�� ��⿭���� ������� �����´�");
	}

	@Override
	public void sandCallToAgent() {
		System.out.println("��⿭���� ������ ��ȭ�� ���� �������� ���ʴ�� �й��մϴ�");
		
	}
	
}
