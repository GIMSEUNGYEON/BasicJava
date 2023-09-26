package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample03 {
	public static void main(String[] args) {
		ArrayExample03 ae03 = new ArrayExample03();
		int[] source = { 27, 63, 15, 84, 35 };
		// ae03.bubbleSort(source);
		// System.out.println(Arrays.toString(source));
		// ae03.bubbleSort02(source, source.length);
		ae03.selectionSort();
	}

	public void bubbleSort(int[] target) { // 배열 변수의 이름을 바꿔서 부를 수 있다. 가져오는건 source 배열의 주소값 그대로 가져온다.
		// 배열 타겟에서 값을 바꾸면 배열 소스에서도 값이 달라진다.
		// target[2] = 75;
		System.out.println("정렬 전 : " + Arrays.toString(target));

		for (int i = 0; i < target.length - 1; i++) {
			for (int j = 0; j < target.length - 1 - i; j++) {
				if (target[j] > target[j + 1]) {
					int tem = target[j];
					target[j] = target[j + 1];
					target[j + 1] = tem;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(target));
	}

	private void bubbleSort02(int[] tar, int size) { // size = source.length
		// 개선된 버블 소트
		boolean f = true;
		int i;
		for (i = 0; i < size - 1; i++) {
			f = true;
			for (int j = 0; j < size - 1 - i; j++) {
				if (tar[j] > tar[j + 1]) {
					int tem = tar[j];
					tar[j] = tar[j + 1];
					tar[j + 1] = tem;
					f = false;
				}
			}
			if (f) {
				System.out.println("회전수 : " + (i + 1));
				break;
			}
			// 자리 바꿈이 성립하면 f 는 false가 되는데 자리 바꿈이 이루어지지 않고 if문 밖으로 나가면 f가 true로 정의되어
			// if(f)가 시작되어 포문을 벗어남
		}

	}

	public int[] selectionSort() {
		// 선택정렬 : 자료의 수가 n개일 때 n-1 회전 수행.
		// 각 회전에서 가장 왼쪽에 있는 자료를 기준으로 다른 모든 자료와 비교하여 자리 교환이 이루어짐.
		// 각 회전 수행 후 가장 왼쪽의 자료는 비교대상에서 제외됨
		// 간단하게 말해서 자료 전체에서 가장 최소값을 찾아 왼쪽에 넣은 다음 가장 왼쪽의 수를 제외하고 나머지 자료에서도 최소값을 찾아
		// 두번째 자리에 집어넣고... 반복
		int[] source = { 17, 43, 15, 84, 35, 40 };
		System.out.println("선택 정렬 전 : " + Arrays.toString(source));

		for (int i = 0; i < source.length - 1; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] > source[j]) {
					int tem = source[i];
					source[i] = source[j];
					source[j] = tem;
				}
			}
		}
		System.out.println("선택 정렬 후 : " + Arrays.toString(source));
		return source;
	}
}
