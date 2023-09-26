package ddit.chap05.sec04;

import java.util.Arrays;

public class CopyArrayExample {
	public static void main(String[] args) {
		// arraycopy();
		// clone1();
		arrayManualcopy();
	}

	// System.arraycopy(원본, 원본의 어디부터 복사?, 복사 받을 배열, 배열2의 시작 위치,몇개만큼 복사?) => 복사해줄 배열과
	// 복사 받을 배열이 생성되어 있어야함.
	public static void arraycopy() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[10];
		System.out.println("복사될 배열 주소 위치 : " + arr2);
		System.out.println("복사될 배열 : " + Arrays.toString(arr2)); // 초기값 0으로 세팅

		System.arraycopy(arr1, 0, arr2, 5, arr1.length);
		System.out.println("원본 배열 : " + Arrays.toString(arr1));
		System.out.println("원본 배열 주소 위치 : " + arr1); // arr1과 arr2의 위치가 다르다
		System.out.println("복사된 배열 : " + Arrays.toString(arr2));
		System.out.println("복사된 배열 주소 위치 : " + arr2); // 복사 전과 후의 arr2의 위치가 같은걸 알수 있음
	}

	// clone() => 복사해줄 배열을 생성함과 동시에 배열 복사
	public static void clone1() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1.clone();
		System.out.println(Arrays.toString(arr2)); // 일부 복사 불가 전부 복사만 가능
		// 배열 복사보다는 객체를 전체 복제할 때 주로 사용
		System.out.println(arr1);
		System.out.println(arr2);
	}

	// for문을 이용해서 복사
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
		// 이렇게 어디에 복사할지 대충 지정 가능
	}
}
