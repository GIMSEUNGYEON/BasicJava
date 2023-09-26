package ddit.chap02.sec03;

public class castExample02 {
	public static void main(String[] args) {
		double year = 365.2422;
		double days = (int)year;
		int d = (int)days;
		
		double hours = (year - days) * 24;
		int hr = (int)hours;
		
		double mins = (hours - (int)hours) * 60;
		int m = (int)mins;
		
		double secs = (mins - (int)mins) * 60;
		int s = (int)secs;
		
		System.out.println("1년은 " + d + "일 " + hr + "시간 " + m + "분 " + s +"초이다.");
		
	}
}
