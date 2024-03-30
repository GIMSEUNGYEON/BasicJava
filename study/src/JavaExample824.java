

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
		System.out.println("int ���� ���� �� 100�� ������Ų��. i ���� -�� �Ǹ� ����ȴ�.");
		int i = 100;
		int result = 0;

		while (result >= 0) {
			result += i;

		}
		System.out.println(result);
	}

	public static void test02() {
		System.out.println("�ζ� ��ȣ 6���� ����Ͻÿ�.");
		System.out.println("���ڴ� 1~45 �ߺ��� ���ڴ� ��� X");
		System.out.println("�迭�� �����ؼ� ����� ��.");
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

		// ũ�� ������ ����ϱ�

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
		System.out.println("�迭�� �ִ밪�� �ּ� ���� ���Ͻÿ�.");
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
