package ddit.chap08.sec01;

public class CalculateExample {
	public static void main(String[] args) {
		CompleteCalc cc = new CompleteCalc(15);
		System.out.println("������ : " + cc.add(1205, 4963));
		System.out.println("������ : " + cc.subtract(1205, 4963));
		System.out.println("���� ���̴� : " + cc.getArea());
	}
}
