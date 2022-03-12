package codeup;

import java.util.Scanner;

// 1406 : love
// 영단어 하나가 입력된다.
// 그 단어가 love이면 I love you. 를 출력하시오.

public class codeup1406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if(word.equals("love")) {
			System.out.println("I love you.");
		}else {
			System.out.println();
		}
	}
}
