package ddit.chap06.sec02;

public class TvExample {
	public static void main(String[] args) {
		Tv samsung = new Tv("�Ｚ����", 2022, 80.5);
		samsung.printInfor();
		
		Tv LG = new Tv("LG����", 2022, 87.5);
		LG.printInfor();
		LG.test();

	}
}
