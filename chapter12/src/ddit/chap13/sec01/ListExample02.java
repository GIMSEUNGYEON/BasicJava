package ddit.chap13.sec01;

import java.util.List;
import java.util.ArrayList;

public class ListExample02 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(23021l, "홍길동"));
		list.add(new Student(20021l, "강감찬"));
		list.add(new Student(22021l, "정몽주"));
		list.add(new Student(23121l, "송시열"));
		System.out.println(list);
		//학번만 추출하기
		for(Student s : list) {
			System.out.println("학번 : " + s.stdId);
		}
	}
}
