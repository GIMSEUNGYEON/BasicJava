package ddit.chap02.sec02;

import java.util.Scanner;
import java.text.DecimalFormat;

// ���� 3������ ������ ����� ���Ͻÿ�. ��, ����� �Ҽ� 2��° �ڸ����� �ݿø�
//���� : 97��, 80��, 90��
	
public class castExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade1;
		double grade2;
		double grade3;
		
		double avg;
		double sum;
		
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		grade1 = sc.nextDouble();
		
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		grade2 = sc.nextDouble();
		
		System.out.print("���� ������ �Է��Ͻÿ�  : ");
		grade3 = sc.nextDouble();
		
		sum = (grade1 + grade2 + grade3);
		System.out.println("���� ���� : " + sum);
		
		avg = (int)(sum/3*10+0.5);
		avg = (double)(avg/10);
		System.out.println(avg);
		//10���ؼ� 1�� �ڸ��� �� 2�� �ڸ����� 0.5�� ���ϰ� int�� ����ȯ�� �Ҽ��� �Ʒ��� ���� ����
		//�ٽ� double�� ����ȯ�ϰ� 10���� ���� �ٽ� ���ڸ��� �о������ ��°�ڸ����� �ݿø�~
		
		DecimalFormat df = new DecimalFormat("0.0");
		//System.out.println("���� ��� : " + df.format(avg));
		//�Ҽ����� �ڸ��� ������ ǥ���ϰ� ���� �� �� ��� �ݿø� ���ֱ� ��
		
		
		String result = String.format("���� ��� : " + "%.1f", avg);
		//System.out.println(result);
		//�Ҽ����� �ݿø��ϰ� ���ڸ����� �ڸ��� ���
		//%.1f : �ι�° �ڸ����� �ݿø��Ͽ� ù��° �ڸ����� ǥ���Ѵ�.
	}
}
