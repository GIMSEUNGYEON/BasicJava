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
		System.out.println("����ȸ�� : " + company);
		System.out.println("����⵵ : " + year);
		System.out.println("��ǰũ�� : " + size + "\n");
	}

	public void test() {
		System.out.printf("%s���� %d�⿡ ����� %f ��ġ�� �����߽��ϴ�", company, year, size);

	}
}