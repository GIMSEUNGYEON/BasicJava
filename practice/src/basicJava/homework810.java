package basicJava;

public class homework810 {
//1���� 365.2422���̴�. �̸� xx��xx�ð�xx��xx�ʷ� ��ȯ�Ͻÿ�.
	public static void main(String[] args) {
		
		double oneYear = 365.2422f;

		double day = (int) oneYear;

		double hour = (oneYear - day) * 24;

		double min = (hour - (int) hour) * 60;

		double sec = (min - (int) min) * 60;

		System.out.println("1���� " + (int) day + "�� " + (int) hour + "�ð� " + (int) min + "�� " + (int) sec + "���̴�.");

	}
}
