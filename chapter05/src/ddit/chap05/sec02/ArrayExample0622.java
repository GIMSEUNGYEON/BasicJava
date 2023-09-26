package ddit.chap05.sec02;

import java.awt.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample0622 {
	public static void main(String[] args) {
		// 1. ���õ� �ټ����� �ܾ �迭�� �����Ͻÿ�.
		// 2. �� �迭���� ������ �ܾ �����Ͽ� choicedWord ������ ����
		// 3. shuffle �޼��忡�� ���õ� �ܾ��� ���ڵ��� ���´�(ex hope = h,o,p,e => p,h,e,o
		// 4. ����ڷκ��� ������ ���� ������ �Է¹޾� ���߸� �����߽��ϴ� �õ�Ƚ�� = ȸ ���,
		// Ʋ������ "Ʋ�Ƚ��ϴ�" ��� �� ��õ�

		Scramblee sc = new Scramblee();
		String choicedword = sc.selectWord();
		//choicedword�� sc���� ����� ������ �ۺ� Ŭ���������� �𸣴ϱ�
		// ����Ʈ���忡�� ��ȯ���� �׷� ������ �ִ�~�� �˷��ִ� ��
		
		sc.question (sc.shuffle(choicedword), choicedword);
		
		//shuffle(��ü) 
		//public String shuffle(String(��ü�� Ÿ�� �˷��ֱ�) ����) ��ü = ����
		//question(��ü, ��ü)
		//public void question(Ÿ�� ����, Ÿ�� ����) ��ü = ����
		//public �ڿ� �ٴ� String Ȥ�� void�� �ش� �޼ҵ尡 ������ ������ ���� �����ϴ°��� �ڱⰡ �޴� ���� �Է����ִ°� �ƴ�
		//�׷��� ()�ȿ� ��ȯ �޴� ��ü�� Ÿ���� �Է��������
		//question �޼ҵ�� ������ ���� ��ȯ���� �ʿ䰡 ��� void, shuffle�� question���� String ���� �ϳ��� ��ߵż� String���� �Ҹ�
		//����Ʈ���忡���� �ƹ����׵� ��ȯ �ȹ޾Ƽ� ��ȣ�� �������
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
			System.out.println("������ �Է��ϼ��� : ");

			String answer = sc.nextLine();
			if (answer.equals(strValue)) {
				b = false;
				System.out.println("�����Դϴ�\n�õ�Ƚ�� : " + count);
			} else {
				b = true;
				System.out.println("Ʋ�Ƚ��ϴ�\n�õ�Ƚ�� : " + count);
				count++;
			}
		}
	}
}