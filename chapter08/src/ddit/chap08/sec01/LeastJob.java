package ddit.chap08.sec01;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ��� ��ȭ�� ��⿭���� ���ʴ�� �����´�");
	}

	@Override
	public void sandCallToAgent() {
		System.out.println("���� ����ϰ� ���� ���� �������� ����ϰų�," + 
						   "��⿭�� ���� ª�� �������� �й��Ѵ�.");
		}

}
