package ddit.chap03.sec01;
import java.util.Scanner;
public class airthmeticOperatorExample03 {
	public static void main(String[] args) {
		//���� ������
		//Ű����κ��� ���̸� �Է¹޾� �� ���̿� �ش��ϴ� ���ɴ븦 ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		int gen = (age/10) * 10;
		System.out.println("���ɴ�� " + gen + "���Դϴ�.");
		if(gen <= 20 ) {
			System.out.println("û�� �����Դϴ�");
		}else if (gen >= 30 & gen <= 50) {
			System.out.println("��� �����Դϴ�");
		}else {
			System.out.println("��� �����Դϴ�");
		}
		int ageGroup = 3;
		String g = (ageGroup <= 2) ? "û�� ����" : (ageGroup >=3 && ageGroup <=5) ? "��� ����" : "��⼼��";
		//ù��° ���ǿ��� 2���� ũ�ٴ� ���� �����ϰ� û�⼼�밡 ��µ��� �ʾ����Ƿ� �ι�° ���ǿ��� 3���� ũ�ų� ���ٴ� ������ ���� �ʾƵ� �ȴ�	}
	}
}
