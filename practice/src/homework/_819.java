package homework;

public class _819 {
	public static void main(String[] args) {

		Example01();
		// Example02();
		// Example03();
		Example04();
	}

	public static void Example01() {
		// 피보나치 수열을 for문으로 표현하기
		// 0 1 1 2 3 5 8 13 21 34까지
		// for(;;)을 이용해서 무한루프를 만들고 조건을 합이 50보다 커질 때 break로 만들면?
		int sum;
		int a = 0;
		int b = 1;
		for (;;) {
			sum = a + b;
			a = b;
			b = sum;
			if (sum > 50) {
				break;
			}
			System.out.println(sum);
		}
	}

	public static void Example02() {
		// for문으로 반복문 횟수 제한하기
		int x = 1;
		int y = 1;
		int z = 0;
		for (int i = 0; i < 7; i++) {
			z = x + y;
			x = y;
			y = z;
			System.out.println(z);
		}
	}

	public static void Example03() {
		// 두 수의 합 크기를 제한하여 반복문을 멈추기
		// 합이 50보다 커질 때 반복문 중지
		// sum으로 결과가 나오기 전에 반복문을 먼저 중지하기 때문에 x=y=21, y=sum=34가 되어 sum이 34가 
		// 될 때 for문 반복문 실행 중지
		int x = 1;
		int y = 1;
		int sum = 0;
		for (; (x + y) < 50;) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.println(sum);
		}
	}

	public static void Example04() {
		// sum이 먼저 55가 된 다음 for문으로 돌아와 조건이 false가 되는걸 확인하기 때문에 55까지 출력됨
		
		int x = 1;
		int y = 1;
		int sum = 0;
		for (; sum < 50;) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.println(sum);
		}
	}
}
