package selfStudies;

import java.io.IOException;

public class fdad {

	public static void main(String[] args) throws IOException {
		int i = 150;
		int res = ++i;
		System.out.println(res); //151
		System.out.println(i);
		int a = i++;
		System.out.println(a); //151 ��� �� 152�� ���� �̶�, a = i�� �״�� �����Ͽ� a �� 151�� �ǰ�, i�� 152�� �ȴ�
		System.out.println(i);
		int b = i - 10;
		System.out.println(b); // ���� : 142 
		int e = a - 10;
		System.out.println(e); // a���� i�� ++�� ����Ǳ� ���� ���� ���ԵǾ����Ƿ� 151�� ���� ������. ���� 141
		
		System.out.println("-------------���뼱-------------");
		
		int score = 150;
		int lastScore = score++; //lastScore���� 150�� �����ϰ�, score�� 151�� �ȴ�
		System.out.print(lastScore); // 150 ���
		int lastScore2 = score--; //lastScore���� 151�� �����ϰ�, score�� 150�� �ȴ�
		System.out.print(lastScore2); // 151���
		System.out.println(score); //150���
		
		System.out.println("-------------���뼱-------------");
		

		int age = 25;
		String address = "����";
		System.out.printf("�� ���̴� %d�Դϴ�%n", age);
		System.out.printf("�� ���̴� %d�̰�, %s�� ��� �ֽ��ϴ�%n",age, address);
		
		System.out.println("-------------���뼱-------------");
		
		int keyCode;
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		
		
		
	}

}
