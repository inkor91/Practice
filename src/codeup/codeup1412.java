package codeup;

import java.util.Scanner;

// 1412 : 알파벳 개수 출력하기 
// ① 90글자 이내의 영어로 된 문장이 입력된다.
// ② 이 문장은 영어 소문자, 공백 및 특수 문자로만 이루어져 있다.
// a부터 z까지 사용된 알파벳 개수를 [입출력 예시]를 참고하여 출력한다. 특수문자와 공백의 개수는 출력하지 않는다.

public class codeup1412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int[] alphabet = new int[26];
		
		for (int i = 0; i < line.length(); i++) {
			for (int j = 97; j < 123; j++) {
				if(line.charAt(i)==j) {
					alphabet[j-97]+=1;
				}
			}
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char)(i+97) + ":" + (alphabet[i]));
		}
		System.out.println();
	}
}
