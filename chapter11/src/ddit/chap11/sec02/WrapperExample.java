package ddit.chap11.sec02;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		//�⺻Ÿ�� => Wrapper
		// ������ �޼ҵ带 �̿�
		Long l1 = new Long(25L);
		Long l2 = 25L; //����ڽ�
		long res = 100+l2; //���� ��ڽ� ������ wrapping�� ��ü�� ������ �ȵǴµ� ���� ��ڽ��� �ż� ���� ��������
		// valueOf �޼ҵ� �̿�
		
		Long l3 = Long.valueOf(25L);
		Long l4 = Long.valueOf("25");
		
		long ll3 = l3.longValue();
		long ll4 = Long.parseLong(String.valueOf(ll3));
		
		ArrayList list = new ArrayList();
		
		list.add(l1);
		list.add(l3);
		list.add("������");
		list.add(true); //����ڽ�
		System.out.println(list);
		
		ArrayList<Long> list2 = new ArrayList<Long>(); // generic �� �� �ִ� Ÿ�� ����
		// list2.add(25); //��ü�� �ƴ϶� ������ �ȵ�
		list2.add(l1);
		list2.add(ll3);
		list2.add(ll4);
		
	}
}
