package selfStudies;

import java.util.Scanner;

public class homework2 {
		public static void main(String[] args) {
			//1년은 365.2422일이다. 이를 xxx일  xx시간 xx분 xx초로 환산하시오.
			double oneYear = 365.2422;
			double days = ((int)oneYear);
			double hours = (oneYear - days) * 24;
			double minute = (hours - (int)hours) * 60;
			double second = (minute - (int)minute) * 60;
			System.out.println("1년 365.2422일은 " + days + "일 " 
					
					+ (float)hours + "시간 " + (float)minute + "분 " 
					
					+ (float)second + "초이다." );
			
			otherMethod();
			
		}
		public static void otherMethod() {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("1년의 실제 날짜 : ");
			double year = 365.2422;
			int day = (int) year;
			System.out.println("day : " + day);
			double hour = (year - day) * 24;
			System.out.println(hour);
			double min = (hour-(int)hour) * 60;
			System.out.println(min);
			double sec = (min - (int)min) * 60;
			System.out.println(sec);
			
			System.out.println("1년 365.2422일은 " + day + "일 " 
			
					+ (float)hour + "시간 " + (float)min + "분 " 
					
					+ (float)sec + "초이다." );
		
		}
	}

