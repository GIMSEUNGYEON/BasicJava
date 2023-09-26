package ddit.chap05.sec03;

import java.util.Arrays;

public class TwoDimArray01 {
	public static void main(String[] args) {
		// 5���� �̸��� 3������ ������ �迭ó���ϰ��� �Ѵ�. �迭�� �����Ͻÿ�.
		// 5�� : ȫ�浿, ������, ������, ������, �̼���
		// �̸� : name ���� : score
//		�̸�		����		���		��ȸ
//		ȫ�浿	80		75		80
//		������	90		85		90
//		������	90		90		80
//		������	80		70		70
//		�̼���	70		95		70	
		Arrayyy01();
	}

	public static void Arrayyy01() {
		String[] name = { "ȫ�浿", "������", "������", "������", "�̼���" };
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

		// ����
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j];
			}

			// ���
			score[i][4] = score[i][3] / 3;
		}

		// ���
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3])
					score[i][5]++;
			}
		}
		// �μ�
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "   ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("\t%d", score[i][j]);
			}
			System.out.println();
		}

		// ����� ���� ������� ���
		// �̸� ���� �ٲٱ�

		System.out.println(Arrays.asList(name));
		for (int i = 0; i < name.length - 1; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (score[i][5] > score[j][5]) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
//					int tem = score[i][5]; // �ݺ��� ������ ������ ���� ����
//					score[i][5] = score[j][5]; // ���� �񱳿� �ǽð� �ݿ�
//					score[j][5] = tem;
					for(int k = 0; k < score[0].length; k++) {
						int tem = score[i][k]; // ��� �����ڷḦ ���� ����
						score[i][k] = score[j][k]; // ���� �񱳿� �ǽð� �ݿ�
						score[j][k] = tem;
					}
				}
			}
		}
		System.out.println(Arrays.asList(name)); 

		// ���� ���� �ٲٱ�
//		Arrays.sort(score, (o1, o2) -> {
//			return o1[5] - o2[5]; // �迭�� ��5�� �������� �������� ����
//		});

		// �μ�
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "   ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("\t%d", score[i][j]);
			}
			System.out.println();
		}
	}
}
