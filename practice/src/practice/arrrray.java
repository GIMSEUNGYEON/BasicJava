package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrrray {
	public static void main(String[] args) {
		int[] ii = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// System.out.println(Arrays.toString(ii));
		for (int i = 1; i < 10000000; i++) {
			Random r = new Random();
			int a = r.nextInt(10);
			int tem = ii[0];
			ii[0] = ii[a];
			ii[a] = tem;
		}
		// System.out.println(Arrays.toString(ii));
		// matterrrrr();
		// ema04();
		// ema05();
		ema06();
	}

	public static void matterrrrr() {
		int var1 = 10;
		int var2 = 10;
		String var3 = "AB";
		String var4 = "AB";
		String var5 = new String("AB");

		boolean b1 = (var1 == var2);
		boolean b2 = (var1 != var2);
		boolean b3 = (var3 == var4);
		boolean b4 = (var3 != var5);
		boolean b5 = (var4.equals(var5));

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}

	public static void ema04() {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}

	public static void ema05() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				num++;
			}
		}
		avg = (double) sum / num;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

	public static void ema06() {
		boolean run = true;
		int studntNum = 0;
		int[] score = null;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.print("학생 수 >");
				int stuNum = sc.nextInt();
				score = new int[stuNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("score[" + i + "]");
					score[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "] >" + score[i]);
				}
			} else if (selectNo == 4) {
				int max = score[0];
				int sum = 0;
				double avg = 0;
				for (int i = 1; i < score.length - 1; i++) {
					if (max < score[i]) {
						max = score[i];
					}

					for (int j = 0; j < score.length; j++) {
						sum += score[j];
					}
				}
				avg = ((double)sum / score.length);
				System.out.println("점수 합산 : " + sum);
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else {

				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
