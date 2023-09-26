package ddit.chap04.sec02;
import java.util.Calendar;

public class ForStatementExample03 {
	public static void main(String[] args) {
		// forMethod01();
		// forMethod02();
		// forMethod03();
		forMethod04();
	}

	public static void forMethod01() {
		// 구구단 출력
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단 : ");
			for (int j = 2; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

	public static void forMethod02() {
		// 2*1=2 3*1=3 4*1=4 ... 9*1=9
		// 2*2 = 4 3*2 = 6 ... 9*2=18
		// 2*3 = 6 ...
		//
		// 2*9=18 ... 9*9=81
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%2d  ", j, i, i * j);
			}
			System.out.println();
		}
	}

	public static void forMethod03() {
		// 1 + 1/2 + 1/3 + 1/4 + 1/10 = ?
		double sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += (double) (1) / (double) (i);
		}
		System.out.println(sum);
	}

	public static void forMethod04() {
		//서기 1년 1월 1일부터 오늘까지 경과된 일수를 구하시오
		int days = 0;
		int year = 1;
		for(year = 1; year < 2023; year++) {
			if(year%4 ==0 && year%100!=0 ||year%400==0) {
				days = days+366;
			}else {
				days = days+365;
			}
		}
		System.out.println("____________");
		System.out.println(days);
		
		//2023년도에서 경과된 일수
		for(int month =1; month<8; month++) {
			switch(month) {
			case 1 : case 3: case 5: case 7 : case 8 : case 10 : case 12:
			days+=31;
			break;
			case 4 : case 6 : case 9 : case 11 : 
			days+=30;
			break;
			case 2 : 
			if(year%4 == 0 && year%100== 0 || year%400==0) {
				days+=29;
			}else {
				days+=28;
			}	
		}
	}
		System.out.println(days);
		System.out.println((days+1)%7);
		days +=20;
		System.out.println(days);
		System.out.println((days+1)%7);
		int today = (days+1)%7;
		switch(today) {
		case 0 : 
			System.out.println("오늘은 일요일입니다.");
			break;
		case 1 : 
			System.out.println("오늘은 월요일입니다.");
			break;
		case 2 : 
			System.out.println("오늘은 화요일입니다.");
			break;
		case 3 : 
			System.out.println("오늘은 수요일입니다.");
			break;
		case 4 : 
			System.out.println("오늘은 목요일입니다.");
			break;
		case 5 : 
			System.out.println("오늘은 금요일입니다.");
			break;
		case 6 : 
			System.out.println("오늘은 토요일입니다.");
			break;
		//Calendar cal = Calendar.getInstance();
		
		}
	}
}
