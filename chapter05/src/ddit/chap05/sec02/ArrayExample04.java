package ddit.chap05.sec02;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample04 {
	public static void main(String[] args) {
		//주사위를 50번 던져 나온 눈의 수를 조사하여 히스토그램 작성
		int his [] = new int[50];
		Random r = new Random();
		String star = "";
		for(int i = 0; i < 50; i++) {
			int dice = r.nextInt(6)+1;
			his[i] = dice;
		}
		//System.out.println(Arrays.toString(his));
		dice dc = new dice();
		dc.histogram();
	}
	}

	class dice {
		
		int[] Dice = new int [6];
		
		dice() {
			for(int i = 0; i < 60; i++) { 
				int r = (int)(Math.random()*6)+1;
				Dice[r-1]++;
		}
			System.out.println(Arrays.toString(Dice));
	}
	
	public void histogram() {
		for(int i = 0 ; i < Dice.length; i++) {
			System.out.print((i+1)+"|");

			for(int j =0; j<Dice[i];j++) {
				System.out.print("*");

			}
			System.out.println(" "+Dice[i]);
		}
	}
}
