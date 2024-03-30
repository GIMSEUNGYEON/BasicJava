

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaExample824 {
	public static void main(String[] args) {
		// test01();
		test02();
		// test03();
	}

	public static void test01() {
		System.out.println("int 값을 선언 후 100씩 증가시킨다. i 값이 -가 되면 종료된다.");
		int i = 100;
		int result = 0;

		while (result >= 0) {
			result += i;

		}
		System.out.println(result);
	}

	public static void test02() {
		System.out.println("로또 번호 6개를 출력하시오.");
		System.out.println("숫자는 1~45 중복된 숫자는 출력 X");
		System.out.println("배열을 선언해서 출력할 것.");
		Random r = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

		// 크기 순서로 출력하기

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 1; j < lotto.length - i; j++) {
				if (lotto[j-1] > lotto[j]) {
					int tem = lotto[j-1];
					lotto[j-1] = lotto[j];
					lotto[j] = tem;
				}
			}
		}

		System.out.println(Arrays.toString(lotto));
	}

	public static void test03() {
		System.out.println("배열의 최대값과 최소 값을 구하시오.");
		int[] arr = { 10, 20, 30, 40, 50, 2, 60, -3 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		Arrays.parallelSort(arr);
		for (int i : arr) { // == for(int i = 0; i<arr.length;i++){int a = arr[i]}
			System.out.println(i);
		}
		System.out.println(max);
		System.out.println(min);
	}
}
