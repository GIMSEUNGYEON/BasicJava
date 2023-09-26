package ddit.chap08.sec01;

public class CalculateExample {
	public static void main(String[] args) {
		CompleteCalc cc = new CompleteCalc(15);
		System.out.println("µ¡¼ÀÀº : " + cc.add(1205, 4963));
		System.out.println("»¬¼ÀÀº : " + cc.subtract(1205, 4963));
		System.out.println("¿øÀÇ ³ĞÀÌ´Â : " + cc.getArea());
	}
}
