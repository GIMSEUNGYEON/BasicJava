package ddit.chap08.sec02;

public class ExceptionExample02 {
	public static void main(String[] args) {
		int[] score = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		int avg = 0;
		try {
			int d = 0;
			for (int i = 0; i <= score.length; i++) {
				d=i+1;
				sum += score[i];
			}
			avg = sum / score.length;
		} catch (NumberFormatException e) {
			System.out.println("수치변환 예외발생");
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 예외발생");
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		} catch (Exception e) {
			System.out.println("모든 예외발생");
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		}
		System.out.println("프로그램 수행 종료");
	}
	
}
