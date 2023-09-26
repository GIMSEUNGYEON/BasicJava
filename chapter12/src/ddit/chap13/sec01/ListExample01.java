package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("홍길동");
		list.add(90);
		list.add(23.56);
		list.add(new Student(2302301L, "이성계"));
		System.out.println(list);
		System.out.println(list.contains("홍길동"));

		// 전체조회
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n==개선된 for 문 사용==");
		for (Object obj : list) { // 개선된 for 문
			System.out.println(obj);
		}
		
		System.out.println("\n==Iterator 기능 사용==");
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