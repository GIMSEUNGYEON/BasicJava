package ddit.chap08.sec01;
//고객센터에 전화가 걸려오면 대기열에 저장된다. 걸려온 전화는 상담원이 배분되기 전까지 대기상태에 있다.
//전화를 상담원에게 분배하는 규칙은 
//1)순서대로 배분
//2)상담하지 않고 있는 상담원이나 대기 전화의 수가 가장 짧은 상담원에게 배분
//3)우선순위에 따른 배분
public interface Scheduler {
	void getNextCall();
	void sandCallToAgent();
}
