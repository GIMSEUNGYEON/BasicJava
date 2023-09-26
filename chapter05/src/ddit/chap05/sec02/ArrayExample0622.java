package ddit.chap05.sec02;

import java.awt.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample0622 {
	public static void main(String[] args) {
		// 1. 제시된 다섯개의 단어를 배열에 저장하시오.
		// 2. 위 배열에서 임의의 단어를 선택하여 choicedWord 변수에 저장
		// 3. shuffle 메서드에서 선택된 단어의 문자들을 섞는다(ex hope = h,o,p,e => p,h,e,o
		// 4. 사용자로부터 정답을 맞출 때까지 입력받아 맞추면 성공했습니다 시도횟수 = 회 출력,
		// 틀렸으면 "틀렸습니다" 출력 후 재시도

		Scramblee sc = new Scramblee();
		String choicedword = sc.selectWord();
		//choicedword는 sc에서 선언된 변수지 퍼블릭 클래스에서는 모르니까
		// 셀렉트워드에서 반환해준 그런 변수가 있다~고 알려주는 중
		
		sc.question (sc.shuffle(choicedword), choicedword);
		
		//shuffle(객체) 
		//public String shuffle(String(객체의 타입 알려주기) 별명) 객체 = 별명
		//question(객체, 객체)
		//public void question(타입 별명, 타입 별명) 객체 = 별명
		//public 뒤에 붙는 String 혹은 void는 해당 메소드가 남한테 보내줄 값을 지정하는거지 자기가 받는 값을 입력해주는게 아님
		//그래서 ()안에 반환 받는 객체의 타입을 입력해줘야함
		//question 메소드는 남한테 굳이 반환해줄 필요가 없어서 void, shuffle은 question에게 String 변수 하나를 줘야돼서 String으로 불림
		//셀렉트워드에서는 아무한테도 반환 안받아서 괄호가 비어있음
	}
}

class Scramblee {
	Random r = new Random();
	static String[] word = { "hope", "love", "apple", "pear", "permission" };

	public String selectWord() {
		int rnd = r.nextInt(word.length);
		String choicedWord = word[rnd];
		System.out.println(choicedWord);
		return choicedWord;

	}

	public String shuffle(String strValue) {
		char[] ch = strValue.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int rnd = r.nextInt(ch.length);
			char tem = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = tem;
		}
		System.out.println(Arrays.toString(ch));

		return new String(ch);
	}

	public void question(String ch, String strValue) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		int count = 1;
		while (b) {
			System.out.println("정답을 입력하세요 : ");

			String answer = sc.nextLine();
			if (answer.equals(strValue)) {
				b = false;
				System.out.println("정답입니다\n시도횟수 : " + count);
			} else {
				b = true;
				System.out.println("틀렸습니다\n시도횟수 : " + count);
				count++;
			}
		}
	}
}