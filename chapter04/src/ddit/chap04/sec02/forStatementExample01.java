package ddit.chap04.sec02;
import java.util.Scanner;
public class forStatementExample01 {
	public static void main(String[] args) {
		//1���� 10���� ����ϱ�
		
		forMethod02();
		forMethod03();
	}
	public static void forMethod01() {
		String s= "";
		for(int i=1; i<=10;i++) {
			s=" ";
		//	System.out.print(i+s);
			//Ȥ�� ����ó��	
			System.out.printf("%-2d",(i));
		}
		
	}
	public static void forMethod02() {
	//1���� 100 ������ ¦���� Ȧ���� ���� ���Ͻÿ�
	int sum = 0;
	int sum1 = 0;
		for(int i=0; i<101; i+=2) {
			sum = sum + i;
		}
		System.out.println("¦���� �� : "+sum);
		for(int i=1; i<101; i+=2) {
			sum1 = sum1 + i;
		}
		System.out.println("Ȧ���� �� : "+ sum1);
		System.out.println(sum+sum1);
		
		//for �� �ϳ��� ����
		//�ٵ� if���ݾ�
		int even =0; 
		int odd = 0;
		for(int i=1; i<101; i++) {
			if (i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
	public static void forMethod03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2~9������ ���� �Է� : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			
		}
	}
}
