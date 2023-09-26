package ddit.chap02.sec02;

import java.util.Scanner;
import java.text.DecimalFormat;

// 다음 3과목의 총점과 평균을 구하시오. 단, 평균은 소수 2번째 자리에서 반올림
//점수 : 97점, 80점, 90점
	
public class castExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade1;
		double grade2;
		double grade3;
		
		double avg;
		double sum;
		
		System.out.print("국어 성적을 입력하시오 : ");
		grade1 = sc.nextDouble();
		
		System.out.print("수학 성적을 입력하시오 : ");
		grade2 = sc.nextDouble();
		
		System.out.print("영어 성적을 입력하시오  : ");
		grade3 = sc.nextDouble();
		
		sum = (grade1 + grade2 + grade3);
		System.out.println("성적 총점 : " + sum);
		
		avg = (int)(sum/3*10+0.5);
		avg = (double)(avg/10);
		System.out.println(avg);
		//10곱해서 1의 자리가 된 2의 자리에게 0.5를 더하고 int로 형변환해 소수점 아래를 버린 다음
		//다시 double로 형변환하고 10으로 나눠 다시 한자리씩 밀어버리면 둘째자리에서 반올림~
		
		DecimalFormat df = new DecimalFormat("0.0");
		//System.out.println("성적 평균 : " + df.format(avg));
		//소수점을 자르고 어디까지 표현하고 싶을 땐 이 방법 반올림 해주긴 함
		
		
		String result = String.format("성적 평균 : " + "%.1f", avg);
		//System.out.println(result);
		//소수점을 반올림하고 그자리에서 자르는 방법
		//%.1f : 두번째 자리에서 반올림하여 첫번째 자리까지 표현한다.
	}
}
