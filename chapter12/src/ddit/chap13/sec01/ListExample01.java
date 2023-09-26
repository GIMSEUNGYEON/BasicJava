package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("ȫ�浿");
		list.add(90);
		list.add(23.56);
		list.add(new Student(2302301L, "�̼���"));
		System.out.println(list);
		System.out.println(list.contains("ȫ�浿"));

		// ��ü��ȸ
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n==������ for �� ���==");
		for (Object obj : list) { // ������ for ��
			System.out.println(obj);
		}
		
		System.out.println("\n==Iterator ��� ���==");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
	}
}

class Student {
	String name;
	long stdId;

	Student() {
	}

	Student(long stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	@Override
	public String toString() {
		return stdId + "-" + name;
	}
}