package ddit.chap13.sec01;

import java.util.List;
import java.util.ArrayList;

public class ListExample02 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(23021l, "ȫ�浿"));
		list.add(new Student(20021l, "������"));
		list.add(new Student(22021l, "������"));
		list.add(new Student(23121l, "�۽ÿ�"));
		System.out.println(list);
		//�й��� �����ϱ�
		for(Student s : list) {
			System.out.println("�й� : " + s.stdId);
		}
	}
}
