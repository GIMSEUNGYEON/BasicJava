package ddit.chap05.sec03;

import java.util.Arrays;

public class TwoDimArray01 {
	public static void main(String[] args) {
		// 5명의 이름과 3과목의 성적을 배열처리하고자 한다. 배열을 생성하시오.
		// 5명 : 홍길동, 정몽주, 강감찬, 김유신, 이순신
		// 이름 : name 성적 : score
//		이름		국어		산수		사회
//		홍길동	80		75		80
//		정몽주	90		85		90
//		강감찬	90		90		80
//		김유신	80		70		70
//		이순신	70		95		70	
		Arrayyy01();
	}

	public static void Arrayyy01() {
		String[] name = { "홍길동", "정몽주", "강감찬", "김유신", "이순신" };
		int[][] score = { { 80, 75, 80, 0, 0, 1 }, { 90, 85, 90, 0, 0, 1 }, { 90, 90, 80, 0, 0, 1 },
				{ 80, 70, 70, 0, 0, 1 }, { 70, 95, 70, 0, 0, 1 } };
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(name[i] + "   ");
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.printf("\t%d", score[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------------------------------");

		// 총점
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j];
			}

			// 평균
			score[i][4] = score[i][3] / 3;
		}

		// 등수
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3])
					score[i][5]++;
			}
		}
		// 인쇄
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "   ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("\t%d", score[i][j]);
			}
			System.out.println();
		}

		// 등수에 따른 순서대로 출력
		// 이름 순서 바꾸기

		System.out.println(Arrays.asList(name));
		for (int i = 0; i < name.length - 1; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (score[i][5] > score[j][5]) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
//					int tem = score[i][5]; // 반복문 내에서 순위만 동시 변경
//					score[i][5] = score[j][5]; // 순서 비교에 실시간 반영
//					score[j][5] = tem;
					for(int k = 0; k < score[0].length; k++) {
						int tem = score[i][k]; // 모든 점수자료를 동시 변경
						score[i][k] = score[j][k]; // 순서 비교에 실시간 반영
						score[j][k] = tem;
					}
				}
			}
		}
		System.out.println(Arrays.asList(name)); 

		// 성적 순서 바꾸기
//		Arrays.sort(score, (o1, o2) -> {
//			return o1[5] - o2[5]; // 배열의 열5를 기준으로 오름차순 정렬
//		});

		// 인쇄
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "   ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("\t%d", score[i][j]);
			}
			System.out.println();
		}
	}
}
