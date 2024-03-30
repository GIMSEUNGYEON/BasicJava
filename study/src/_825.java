import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _825 {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		//test0();
		//test1();
		test2();
	}

	public static void test0() {
		System.out.println("입력한 분 값이 60분을 넘는다면 시간으로 출력하시오.\n만약 시간이 24시간을 넘는다면 일로 출력");
		System.out.print("분을 입력하세요 : ");
		int time = sc.nextInt();

		int hour = (time / 60);
		int min = (time % 60);

		if (hour >= 24) {
			// 25시간이라고 치면 day = 1이고 hour = 1시간
			int day = (hour / 24);
			hour = (hour%24);
			System.out.println("현재시간은 " + day + "일 " + hour + "시간" + min + "분 입니다.");
		} else {
			System.out.println("현재 시간은 " + hour + "시간 " + min + "분 입니다.");
		}

	}
	public static void test1() {
		int time = r.nextInt(2000)+1;
		while(true) {
			System.out.println(time + "분 남았습니다.");
			int input = sc.nextInt();
			System.out.println(input + "분이 경과되었습니다.");
			//문제 못봤어
		}
	}
	
	public static void test2() {
			//로또 결과를 다섯줄 출력하기
		
		}
}
