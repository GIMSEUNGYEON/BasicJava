package ddit.chap11.sec02;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		//기본타입 => Wrapper
		// 생성자 메소드를 이용
		Long l1 = new Long(25L);
		Long l2 = 25L; //오토박싱
		long res = 100+l2; //오토 언박싱 원래는 wrapping된 객체는 연산이 안되는데 오토 언박싱이 돼서 연산 가능해짐
		// valueOf 메소드 이용
		
		Long l3 = Long.valueOf(25L);
		Long l4 = Long.valueOf("25");
		
		long ll3 = l3.longValue();
		long ll4 = Long.parseLong(String.valueOf(ll3));
		
		ArrayList list = new ArrayList();
		
		list.add(l1);
		list.add(l3);
		list.add("정몽주");
		list.add(true); //오토박싱
		System.out.println(list);
		
		ArrayList<Long> list2 = new ArrayList<Long>(); // generic 들어갈 수 있는 타입 제한
		// list2.add(25); //객체가 아니라 변수라서 안들어감
		list2.add(l1);
		list2.add(ll3);
		list2.add(ll4);
		
	}
}
