package ddit.chap04.sec03;

public class WhileStatementExample01 {
	public static void main(String[] args) {
		// whileMethod01();
		// whileMethod02();
		whileMethod03();
	}

	public static void whileMethod01() {
		int numOfChop = 1;
		while (numOfChop < 10) {
			System.out.println("나무를 " + numOfChop + "번 찍었습니다");
			System.out.println("아직 넘어가지 않았습니다.\n");
			numOfChop++;
		}
		System.out.println("나무를 " + numOfChop + "번 찍었습니다");
		System.out.println(numOfChop + "번 찍어 안넘어가는 나무 없다");
	}

	public static void whileMethod02() {
		int a = 1;
		int b = 1;
		int sum = 0;
		System.out.printf("%2d,  %2d,  ", a, b);
		while (sum < 50) {
			sum = a + b;
			if (sum < 50) {
				System.out.printf("%2d,  ", sum);
			} else {
				break;
			}
			a = b;
			b = sum;
		}
	}

	public static void whileMethod03() {
		// 오늘은 100원, 내일부터 두배씩 저금할때 100만원이 언제 모이나?
		int i = 100;
		int sum = 0;
		int days = 0;
		while (true) {
			if (sum < 1000000) {
				sum += i;
				i *= 2;
				days++;
			} else {
				break;
			}
			System.out.println("모인 돈 : " + sum + "\t 경과일수 : " + days);
		}
	}
}
