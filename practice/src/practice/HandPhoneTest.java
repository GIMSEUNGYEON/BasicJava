package practice;

public class HandPhoneTest {
	public static void main(String[] args) {
		HandPhone samsungHpc = new HandPhone();
		HandPhone lgHpc = new HandPhone();
		HandPhone motoHpc = new HandPhone();  
		// ��ü�� ���� �����ؼ� HandPhone Ŭ�����κ��� �޴� ���� ���� �޸��� �� ����
		
		//��ü samsungHpc�� �� ������
		samsungHpc.name = "������";
		samsungHpc.address = "����� ������";
		samsungHpc.phoneNumber = "010-1234-1234";
		//���
		samsungHpc.ownerInfo();
		System.out.println();
		
		lgHpc.name = "���̶�";
		lgHpc.address = "����� ���α�";
		lgHpc.phoneNumber = "010-1234-5556";
		
		lgHpc.ownerInfo();
		System.out.println();
		
		motoHpc.name = "ȫ�浿";
		motoHpc.address = "����� ���α�";
		motoHpc.phoneNumber = "010-7777-8888";
		
		motoHpc.ownerInfo();
		System.out.println();
		
		// �Ʒ��� ��ȭ�� �ɰų� �޴� �޼ҵ� ȣ��
		//��ü samsungHpc�� �̿��Ͽ� �޼ҵ� hangUp���� ����� ������ �״�� �����ͼ� ���
		samsungHpc.hangUp();
		lgHpc.recieve();
		motoHpc.hangUp();
	}
}
