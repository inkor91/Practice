package codeup;

import java.util.Scanner;

// 1254 : 알파벳 출력하기
// 시작 알파벳과 마지막 알파벳을 입력받아 그 두 알파벳 사이의 모든 알파벳을 출력하시오.
// 시작 알파벳과 마지막 알파벳을 공백으로 띄워 입력받는다.(소문자만 입력되고, 사전순으로 입력된다.)
// 두 알파벳 사이의 모든 알파벳을 출력한다.

public class codeup1254 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		int start = 0;
		int end = 0;
		
		
		if(a > b ) {
			start = b;
			end = a;
		}else {
			start = a;
			end = b;
		}
		
	
		for (int i = start; i <= end; i++) {
			System.out.print((char)i+ " ");
		}
		
	}
}
