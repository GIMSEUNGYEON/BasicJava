package ddit.chap08.sec01;

import java.io.IOException;

import javax.imageio.IIOException;

public class SchedulerExample {
	public static void main(String[] args) throws IOException{
		System.out.println("상담전화 분배 방식 선택");
		System.out.println("R : 순서대로 분배");
		System.out.println("L : 대기열이 짧은 상담원부터 연결");
		System.out.println("P : 우선순위가 높은 고객부터 할당");
		
		int c = System.in.read();
		Scheduler scheduler = null;
		
		if(c == 'R' || c == 'r') {
			scheduler = new RoundRoin();
		}else if(c == 'L' || c =='l'){
			scheduler = new LeastJob();
			
		}else if(c=='P' || c=='p') {
			scheduler = new PrioirtyAllocation();
		}else {
			System.out.println("잘못된 문자가 입력되었습니다.");
		}
		scheduler.getNextCall();
		scheduler.sandCallToAgent();
	}
}
