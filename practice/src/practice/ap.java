package practice;

import java.util.Arrays;
import java.util.Random;

public class ap {

	public static void main(String[] args) {
		int[] aa = new int[9];
		Random r = new Random();
		for (int i = 0; i < 9; i++) {
			aa[i] = i + 1;

		}
		System.out.println(Arrays.toString(aa));

		for (int i = 0; i < 10000000; i++) {
			int rnd = r.nextInt(9);
			int temp = aa[0];
			aa[0] = aa[rnd];
			aa[rnd] = temp;
		}
		System.out.println(Arrays.toString(aa));

		fadfsdf();
	}

	public static void fadfsdf() {
		char[] fadf = { 'a', 'b', 'c', 'd' };
		System.out.println(fadf); // char 타입 배열은 그냥 출력해줌
		char[][] adf = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' }, { 'i', 'j', 'k', 'l' } };
		System.out.println(adf);// 2차원 배열은 주소 출력
		System.out.println("----------------");
		for (int i = 0; i < adf.length; i++) {
			for (int j = 0; j < adf[i].length; j++) {
				System.out.print(adf[i][j]);
			}
		}
	}

}
