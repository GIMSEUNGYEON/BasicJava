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

//���õ� 5���� �ܾ �迭�� �����Ͻÿ�.
//"hope", "love", "apple", "pear", "permission"
// 1. �� �迭���� ������ �ܾ �����Ͽ� ���, choicedWord ������ ����
// 2. �ܾ��� ���� ȥ��
// 3. ���õ� �ܾ��� ���ڵ��� ���´�. ex) hope -> h,o,p,e
// 4. ����ڷκ��� ������ ���⶧���� �Է¹޾� ���߸� �����߽��ϴ� �õ�Ƚ�� = ȸ
// Ʋ������ "Ʋ�Ƚ��ϴ�" ��� �� �ٽ� ������ �Է¹ޱ�
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
		System.out.println("���� �� : " + Arrays.asList(word));
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
