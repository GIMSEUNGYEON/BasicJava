package ddit.chap08.sec01;

public class PrioirtyAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���Ͽ� ���� ���� ����� ����ȭ�� �����´�");
	}

	@Override
	public void sandCallToAgent() {
		System.out.println("���� ���� �ɷ��� ����� ������� ��⿭ ���� " + 
						   "�����ȭ�� �й��Ѵ�.");
		}

}
