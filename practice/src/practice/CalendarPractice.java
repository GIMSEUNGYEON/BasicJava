package practice;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요 : ");
		int mon = sc.nextInt();
		int days = 0;

		for (int i = 1; i < year; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				days = days + 366;
			} else {
				days = days + 365;
			}
		}
		System.out.println(days);
		int lastDay = 0;
		for (int i = 1; i < mon; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days += 30;
				break;
			case 2:
				if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
					days += 29;
				} else {
					days += 28;
				}
			}
		}

		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
				lastDay = 29;
			} else {
				lastDay = 28;
			}
		}
		System.out.println(days);
		int week = (days + 1) % 7;
		String Week = "";
		switch (week) {
		case 0:
			Week = "일요일";
			break;
		case 1:
			Week = "월요일";
			break;
		case 2:
			Week = "화요일";
			break;
		case 3:
			Week = "수요일";
			break;
		case 4:
			Week = "목요일";
			break;
		case 5:
			Week = "금요일";
			break;
		case 6:
			Week = "토요일";
			// 으로 시작하는 달이라는 뜻
		}

		int dd = week;
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");

		for (int i = 1; i <= week; i++) {
			System.out.print("\t");
		}
		for (int j = 1; j <= lastDay; j++) {
			System.out.print(j + "\t");
			dd++;
			if (dd % 7 == 0)
				System.out.println();
		}

//		System.out.println(Week);
//		switch(mon) {
//		case 1: case 3: case 5: case 7: case 8: case 10:case 12: 
//			switch(week) {
//			
//			}
//			break;
//		case 4: case 6: case 9: case 11:
//			days += 30;
//			break;
//		case 2:
//			if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
//				days += 29;
//			} else {
//				days += 28;
//			}
//	
//		}
		// 달력을 출력하려면 해당 달이 며칠까지 있는지, 그 해가 윤년인지 아닌지 여부도 따져서 2월 출력하고 요일까지 만들어야만

	}
}
