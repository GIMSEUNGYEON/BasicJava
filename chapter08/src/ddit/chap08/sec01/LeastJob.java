package ddit.chap08.sec01;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("다음 상담 전화는 대기열에서 차례대로 가져온다");
	}

	@Override
	public void sandCallToAgent() {
		System.out.println("현재 상담하고 있지 않은 상담원에게 배분하거나," + 
						   "대기열이 가장 짧은 상담원에게 분배한다.");
		}

}
