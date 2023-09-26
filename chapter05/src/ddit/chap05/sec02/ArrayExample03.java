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

	public void bubbleSort(int[] target) { // �迭 ������ �̸��� �ٲ㼭 �θ� �� �ִ�. �������°� source �迭�� �ּҰ� �״�� �����´�.
		// �迭 Ÿ�ٿ��� ���� �ٲٸ� �迭 �ҽ������� ���� �޶�����.
		// target[2] = 75;
		System.out.println("���� �� : " + Arrays.toString(target));

		for (int i = 0; i < target.length - 1; i++) {
			for (int j = 0; j < target.length - 1 - i; j++) {
				if (target[j] > target[j + 1]) {
					int tem = target[j];
					target[j] = target[j + 1];
					target[j + 1] = tem;
				}
			}
		}
		System.out.println("���� �� : " + Arrays.toString(target));
	}

	private void bubbleSort02(int[] tar, int size) { // size = source.length
		// ������ ���� ��Ʈ
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
				System.out.println("ȸ���� : " + (i + 1));
				break;
			}
			// �ڸ� �ٲ��� �����ϸ� f �� false�� �Ǵµ� �ڸ� �ٲ��� �̷������ �ʰ� if�� ������ ������ f�� true�� ���ǵǾ�
			// if(f)�� ���۵Ǿ� ������ ���
		}

	}

	public int[] selectionSort() {
		// �������� : �ڷ��� ���� n���� �� n-1 ȸ�� ����.
		// �� ȸ������ ���� ���ʿ� �ִ� �ڷḦ �������� �ٸ� ��� �ڷ�� ���Ͽ� �ڸ� ��ȯ�� �̷����.
		// �� ȸ�� ���� �� ���� ������ �ڷ�� �񱳴�󿡼� ���ܵ�
		// �����ϰ� ���ؼ� �ڷ� ��ü���� ���� �ּҰ��� ã�� ���ʿ� ���� ���� ���� ������ ���� �����ϰ� ������ �ڷῡ���� �ּҰ��� ã��
		// �ι�° �ڸ��� ����ְ�... �ݺ�
		int[] source = { 17, 43, 15, 84, 35, 40 };
		System.out.println("���� ���� �� : " + Arrays.toString(source));

		for (int i = 0; i < source.length - 1; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] > source[j]) {
					int tem = source[i];
					source[i] = source[j];
					source[j] = tem;
				}
			}
		}
		System.out.println("���� ���� �� : " + Arrays.toString(source));
		return source;
	}
}
