package codeup;

import java.util.Scanner;

// 1702 : 학번 출력하기


public class codeup1702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		System.out.println(Integer.parseInt(b)%2 == 0 ? a+b+c+" "+a+b+c : a+b+c);
	}
}
