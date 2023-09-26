package ddit.chap05.sec04;

import java.util.Arrays;

public class CopyArrayExample {
	public static void main(String[] args) {
		// arraycopy();
		// clone1();
		arrayManualcopy();
	}

	// System.arraycopy(����, ������ ������ ����?, ���� ���� �迭, �迭2�� ���� ��ġ,���ŭ ����?) => �������� �迭��
	// ���� ���� �迭�� �����Ǿ� �־����.
	public static void arraycopy() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[10];
		System.out.println("����� �迭 �ּ� ��ġ : " + arr2);
		System.out.println("����� �迭 : " + Arrays.toString(arr2)); // �ʱⰪ 0���� ����

		System.arraycopy(arr1, 0, arr2, 5, arr1.length);
		System.out.println("���� �迭 : " + Arrays.toString(arr1));
		System.out.println("���� �迭 �ּ� ��ġ : " + arr1); // arr1�� arr2�� ��ġ�� �ٸ���
		System.out.println("����� �迭 : " + Arrays.toString(arr2));
		System.out.println("����� �迭 �ּ� ��ġ : " + arr2); // ���� ���� ���� arr2�� ��ġ�� ������ �˼� ����
	}

	// clone() => �������� �迭�� �����԰� ���ÿ� �迭 ����
	public static void clone1() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1.clone();
		System.out.println(Arrays.toString(arr2)); // �Ϻ� ���� �Ұ� ���� ���縸 ����
		// �迭 ���纸�ٴ� ��ü�� ��ü ������ �� �ַ� ���
		System.out.println(arr1);
		System.out.println(arr2);
	}

	// for���� �̿��ؼ� ����
	public static void arrayManualcopy() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));

		for (int i = 0; i < arr1.length; i++) {
			arr2[i + 5] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		// �̷��� ��� �������� ���� ���� ����
	}
}
