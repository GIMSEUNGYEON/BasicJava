package selfStudies;

import java.io.IOException;

public class fdad {

	public static void main(String[] args) throws IOException {
		int i = 150;
		int res = ++i;
		System.out.println(res); //151
		System.out.println(i);
		int a = i++;
		System.out.println(a); //151 출력 후 152로 연산 이때, a = i를 그대로 대입하여 a 는 151이 되고, i는 152가 된다
		System.out.println(i);
		int b = i - 10;
		System.out.println(b); // 예상 : 142 
		int e = a - 10;
		System.out.println(e); // a에는 i에 ++가 연산되기 전의 값이 대입되었으므로 151의 값을 가진다. 따라서 141
		
		System.out.println("-------------절취선-------------");
		
		int score = 150;
		int lastScore = score++; //lastScore에는 150을 대입하고, score는 151이 된다
		System.out.print(lastScore); // 150 출력
		int lastScore2 = score--; //lastScore에는 151을 대입하고, score는 150이 된다
		System.out.print(lastScore2); // 151출력
		System.out.println(score); //150출력
		
		System.out.println("-------------절취선-------------");
		

		int age = 25;
		String address = "대전";
		System.out.printf("내 나이는 %d입니다%n", age);
		System.out.printf("내 나이는 %d이고, %s에 살고 있습니다%n",age, address);
		
		System.out.println("-------------절취선-------------");
		
		int keyCode;
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		
		
		
	}

}
