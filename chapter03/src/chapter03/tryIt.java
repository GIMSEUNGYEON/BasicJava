package chapter03;

import java.util.Scanner;

public class tryIt {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int i;
		//System.out.println("�Էµ� ����  :\"" + i + "\"");
		//System.out.println( "���ڸ� �Է��ϼ��� :" );
		i= sc.nextInt();
		tryGo();
		
	}
	public static void tryGo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		
		String grade = "";
		int score = sc.nextInt();
		if(score > 89 && score < 101) {
			grade = "A";
		}
		}
}
