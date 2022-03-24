package codeup;

import java.util.Scanner;

//1418 : t를 찾아라
// 공백이 없는 문자열이 한 줄 입력된다.(10글자 이하)
// 소문자 t의 위치를 공백으로 분리하여 모두 출력하시오.

public class codeup1418 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='t') {
				System.out.print(i+1+" ");
			}
		}
	}
}
