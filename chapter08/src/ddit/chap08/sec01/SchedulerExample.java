package ddit.chap08.sec01;

import java.io.IOException;

import javax.imageio.IIOException;

public class SchedulerExample {
	public static void main(String[] args) throws IOException{
		System.out.println("�����ȭ �й� ��� ����");
		System.out.println("R : ������� �й�");
		System.out.println("L : ��⿭�� ª�� �������� ����");
		System.out.println("P : �켱������ ���� ������ �Ҵ�");
		
		int c = System.in.read();
		Scheduler scheduler = null;
		
		if(c == 'R' || c == 'r') {
			scheduler = new RoundRoin();
		}else if(c == 'L' || c =='l'){
			scheduler = new LeastJob();
			
		}else if(c=='P' || c=='p') {
			scheduler = new PrioirtyAllocation();
		}else {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
		scheduler.getNextCall();
		scheduler.sandCallToAgent();
	}
}
