package codeup;

import java.util.Scanner;

// 1295 : 알파벳 대소문자 변환
// 주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성
// 대소문자를 서로 변환한 결과를 출력

public class codeup1295 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if((int)b[i] > 96 &&(int)b[i] < 123) {
				b[i]-=32;				
			}
			else if((int)b[i] > 64 &&(int)b[i] < 91) {
				b[i]+=32;				
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
