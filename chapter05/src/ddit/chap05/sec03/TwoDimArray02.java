package ddit.chap05.sec03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimArray02 {
	public static void main(String[] args) {
		// 주사위를 50번 던져서 나온 눈의 수로 히스토그램을 그리시오.
		TwoDimDice01();
	}

	public static void TwoDimDice01() {
		Random r = new Random();
		int[] one = new int[6];
		for (int i = 0; i < 50; i++) {
			int rnd = r.nextInt(6) + 1;
			one[rnd - 1]++;
		}

		System.out.println(Arrays.toString(one));

		int max = one[0];
		for (int i = 0; i < one.length; i++) {
			if (max < one[i]) {
				max = one[i];
			}
		}

		System.out.println(max);

		System.out.println();
		char[][] histo = new char[max][one.length];

		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one[i]; j++) {
				histo[j][i] = '*';
			}
		}
		
		for (int i = histo.length - 1; i >= 0; i--) {
			for (int j = 0; j < histo[i].length; j++) {
				System.out.print(histo[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------");
		
		int line[] = new int[6];
		for (int i = 0; i < one.length; i++) {
			line[i] = i + 1;
			System.out.print(line[i] + "\t");
		}
	}
}
