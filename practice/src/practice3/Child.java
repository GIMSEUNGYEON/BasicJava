package practice3;

public class Child extends Parents {
	String childName = "ȫ����";
	int childAge = 11;
	
	public void childInfo() {
		//���� Ŭ������ ��������� ���� �Ҵ� �� super. ��������� �̿��Ͽ� ������
		super.parentName = "ȫ�浿";
		super.parentAge = 75;
		//�������� ������ ���� Ŭ������ �޼ҵ带 ���ÿ��� super �̿�
		super.parentInfo();
		
		System.out.printf("���� �̸��� %s�̰�, ���̴� %d ���̴�.\n",
							childName, childAge);	
	}
}
