package practice;

public class HandPhone {
	String phoneNumber;
	String name;
	String address;
	
	public void hangUp() {
		System.out.printf("%s���� %s ��ȣ�� ��ȭ�� �Ǵ�. \n", name, phoneNumber);
	}
	public void recieve() {
		System.out.printf("%s�� %s ��ȣ�κ��� ��ȭ�� �޴´�.\n",name,phoneNumber);
		
	}
	public void ownerInfo(){
	System.out.printf("�̸� : %s\n", name);
		System.out.printf("�ּ� : %s\n", address);
		System.out.printf("�ڵ�����ȣ : %s\n", phoneNumber);
	}
}
