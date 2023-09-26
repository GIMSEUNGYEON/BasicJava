package ddit.chap06.sec02;

public class Tv {
	private String company;
	private int year;
	private double size;

	Tv(String company, int year, double size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}

	Tv() {

	}

	public void printInfor() {
		System.out.println("제조회사 : " + company);
		System.out.println("생산년도 : " + year);
		System.out.println("제품크기 : " + size + "\n");
	}

	public void test() {
		System.out.printf("%s에서 %d년에 생산된 %f 인치를 구매했습니다", company, year, size);

	}
}
