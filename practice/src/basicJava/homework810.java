package basicJava;

public class homework810 {
//1년은 365.2422일이다. 이를 xx일xx시간xx분xx초로 변환하시오.
	public static void main(String[] args) {
		
		double oneYear = 365.2422f;

		double day = (int) oneYear;

		double hour = (oneYear - day) * 24;

		double min = (hour - (int) hour) * 60;

		double sec = (min - (int) min) * 60;

		System.out.println("1년은 " + (int) day + "일 " + (int) hour + "시간 " + (int) min + "분 " + (int) sec + "초이다.");

	}
}
