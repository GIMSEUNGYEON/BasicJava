package ddit.chap05.sec02;

public class ArrayExample05 {
	public static void main(String[] args) {
		// �ִ밪 �ּҰ� ���ϱ�
		int[] num = { 15, 23, 7, 85, 66, 27, 10 };
		int tmin = num[0];
		int tmax = num[0];
		for (int i = 1; i < num.length; i++) {
			if (tmin > num[i]) {
				tmin = num[i];
			}
			if (tmax < num[i]) {
				tmax = num[i];
			}
		}
		System.out.println("�ּҰ� : " + tmin + " \n�ִ밪 : " + tmax);
	}
}
