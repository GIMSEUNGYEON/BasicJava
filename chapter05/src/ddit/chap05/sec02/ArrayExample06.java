package ddit.chap05.sec02;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample06 {
	public static void main(String[] args) {
		Scramble sc = new Scramble();
		// String tem =sc.shuffle();
		sc.selectWord();
		//sc.shuffle();
		String shuffle = sc.shuffle();
		sc.shuffle02();
		//String question=sc.shuffle02(choicedWord);
	}
}

//제시된 5개의 단어를 배열에 저장하시오.
//"hope", "love", "apple", "pear", "permission"
// 1. 위 배열에서 임의의 단어를 선택하여 출력, choicedWord 변수에 저장
// 2. 단어의 순서 혼합
// 3. 선택된 단어의 문자들을 섞는다. ex) hope -> h,o,p,e
// 4. 사용자로부터 정답을 맞출때까지 입력받아 맞추면 성공했습니다 시도횟수 = 회
// 틀렸으면 "틀렸습니다" 출력 후 다시 정답을 입력받기
class Scramble {
	String[] word = { "hope", "love", "apple", "pear", "permission" };
	Random r = new Random();
	int choice = r.nextInt(5);

	public void selectWord() {
		System.out.println(word[choice]);
		
		System.out.println(Arrays.asList(word));
		for (int i = 0; i < word.length; i++) {
			// System.out.println(word[i]);
		
		}
		String choicedWord = word[choice];	
		
		System.out.println(choicedWord);
		}

	public void shuffle02() {
		// TODO Auto-generated method stub
		
	}

	public String shuffle() {
		for (int i = 0; i < 1000000; i++) {
			int rnd = r.nextInt(5);
			String tem = word[0];
			word[0] = word[rnd];
			word[rnd] = tem;

		}
		System.out.println("섞은 후 : " + Arrays.asList(word));
		return null;

	}
	
	public String shuffle02(String str) {
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) {
		ch[i] = str.charAt(i);
		}
		for(int i = 0; i < 100; i++) {
			int rnd = r.nextInt(ch.length);
			char tem = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = tem;
		}
		System.out.println(Arrays.toString(ch));
		return new String(ch);
	}

}
