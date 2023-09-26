package ddit.chap08.sec01;

public class RoundRoin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("다음 상담 전화를 대기열에서 순서대로 가져온다");
	}

	@Override
	public void sandCallToAgent() {
		System.out.println("대기열에서 가져온 전화를 다음 상담원에게 차례대로 분배합니다");
		
	}
	
}
