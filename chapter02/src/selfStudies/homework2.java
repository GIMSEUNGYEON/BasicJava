package selfStudies;

import java.util.Scanner;

public class homework2 {
		public static void main(String[] args) {
			//1���� 365.2422���̴�. �̸� xxx��  xx�ð� xx�� xx�ʷ� ȯ���Ͻÿ�.
			double oneYear = 365.2422;
			double days = ((int)oneYear);
			double hours = (oneYear - days) * 24;
			double minute = (hours - (int)hours) * 60;
			double second = (minute - (int)minute) * 60;
			System.out.println("1�� 365.2422���� " + days + "�� " 
					
					+ (float)hours + "�ð� " + (float)minute + "�� " 
					
					+ (float)second + "���̴�." );
			
			otherMethod();
			
		}
		public static void otherMethod() {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("1���� ���� ��¥ : ");
			double year = 365.2422;
			int day = (int) year;
			System.out.println("day : " + day);
			double hour = (year - day) * 24;
			System.out.println(hour);
			double min = (hour-(int)hour) * 60;
			System.out.println(min);
			double sec = (min - (int)min) * 60;
			System.out.println(sec);
			
			System.out.println("1�� 365.2422���� " + day + "�� " 
			
					+ (float)hour + "�ð� " + (float)min + "�� " 
					
					+ (float)sec + "���̴�." );
		
		}
	}

