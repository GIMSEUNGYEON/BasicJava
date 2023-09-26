package ddit.chap04.sec03;

public class Homework02 {
	public static void main(String[] args) {
		//1-2+3-4 ... -10 = ?
		int sign = -1;
		int sum = 0;
		int cnt = 1;
		while(cnt<11) {
			sign*=(-1);
			sum+=sign*cnt;
			if(sign>0 && cnt>1) {
				System.out.print("+"+(sign*cnt));
			}else {
				System.out.print(sign*cnt);
			}
			cnt++;
		}System.out.println("="+sum);
	}
}
