package homework;
	import java.util.Scanner;
public class check {
		public static void main(String[] args) {
//			int pencils =534;
//			int st = 30;
//			int stPencil = (pencils/st);
//			
//			int pencilLeft = (pencils%st);
//			
//			System.out.println(stPencil);
//			System.out.println(pencilLeft);
//			int var1 = 5;
//			int var2 = 2;
//			double var3 = (double)var1/(double)var2;
//			
//			System.out.println(var3);
//			int var4 = (int)(var3*var2);
//			System.out.println(var4);
			
//			int value = 365;
//			System.out.println(value/100*100);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int age = sc.nextInt();
			System.out.print("���� �Է� : ");
			String hometown = sc.next();
			System.out.print("�� �Է� : ");
			String firstname = sc.next();
			
			if(age == 25) {
				if(hometown.equals("����")) {
					if(firstname.equals("��")) {
						System.out.println("�̾� �� ����");
					}else {
						System.out.println("�ƴ� ����");
					}
				}else {
					System.out.println("�ƴ� ����");
				}
			}else {
				System.out.println("�ƴ� ����");
			}
			
		}
}
