package ddit.chap05.sec02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {
	int [] lotto = new int [45];
	Random r = new Random();
	public static void main(String[] args) {
		new ArrayExample02().Lotto();
		//�ζ� ��ȣ �����
	}
	public void Lotto() {
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		System.out.println(Arrays.toString(lotto));
		//�迭 ��Ҹ� ���� ���
		shuffle();
		System.out.println(Arrays.toString(lotto));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		for(int i = 1; i <= money/1000; i++) {
			shuffle();
			for(int j = 0 ; j < 6; j++) {
				System.out.printf("%5d\n", lotto[j]);
			}
		}
	}
	public void shuffle(){
		for(int i = 0; i<1000000; i++) {
			int rnd = r.nextInt(45); //0~44 ���̿��� �߻��ϴ� ����
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;			
		}
		
	}
}
