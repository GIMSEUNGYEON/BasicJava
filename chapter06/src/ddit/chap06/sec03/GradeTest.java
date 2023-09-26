package ddit.chap06.sec03;

public class GradeTest {
	public static void main(String[] args) {
		Grade g1 = new Grade();
		System.out.println("己利 醚痢 : " + g1.sum());
		System.out.println("己利 乞闭 : " + g1.avg() + "\n");

		Grade g2 = new Grade(100);
		System.out.println("己利 醚痢 : " + g2.sum());
		System.out.println("己利 乞闭 : " + g2.avg() + "\n");

		Grade g3 = new Grade(100, 100);
		System.out.println("己利 醚痢 : " + g3.sum());
		System.out.println("己利 乞闭 : " + g3.avg() + "\n");
		
		Grade g4 = new Grade(100, 100, 100);
		System.out.println("己利 醚痢 : " + g4.sum());
		System.out.println("己利 乞闭 : " + g4.avg() + "\n");

	}
}
