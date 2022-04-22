package codeup;

import java.util.Scanner;

// 1752 : 뒤집어 출력하기
// 20글자 이하의 한 단어가 입력된다.
// 입력된 단어를 뒤집어 출력하시오.

public class codeup1752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		for (int i = line.length() -1 ; i >= 0; i--) {
			System.out.print(line.charAt(i));
		}
	}
}
