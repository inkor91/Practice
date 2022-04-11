package codeup;

import java.util.Scanner;

// 1701 : 세 정수 거꾸로 출력하기 
// 정수 3개가 입력된다.
// 입력의 역순으로 출력한다.

public class codeup1701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+b+" "+a);
	}
}
