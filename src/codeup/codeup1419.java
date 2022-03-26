package codeup;

import java.util.Scanner;

// 1419 : love 2
// 영어 한 문장이 입력된다.(공백 있음, 최대 글자수 100)
// 소문자 love가 몇 번 나오는지 출력한다.

public class codeup1419 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;
		for (int i = 0; i < word.length()-4; i++) {
			if(word.substring(i, i+4).equals("love")) {
					count++;
			}
		}
		
		System.out.println(count);
	}
}
