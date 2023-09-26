package ddit.chap03.sec01;
import java.util.Scanner;
public class airthmeticOperatorExample03 {
	public static void main(String[] args) {
		//삼항 연산자
		//키보드로부터 나이를 입력받아 그 나이에 해당하는 연령대를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int gen = (age/10) * 10;
		System.out.println("연령대는 " + gen + "대입니다.");
		if(gen <= 20 ) {
			System.out.println("청년 세대입니다");
		}else if (gen >= 30 & gen <= 50) {
			System.out.println("장년 세대입니다");
		}else {
			System.out.println("노년 세대입니다");
		}
		int ageGroup = 3;
		String g = (ageGroup <= 2) ? "청년 세대" : (ageGroup >=3 && ageGroup <=5) ? "장년 세대" : "노년세대";
		//첫번째 조건에서 2보다 크다는 것을 부정하고 청년세대가 출력되지 않았으므로 두번째 조건에서 3보다 크거나 같다는 조건을 쓰지 않아도 된다	}
	}
}
