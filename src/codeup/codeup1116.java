package codeup;

import java.util.Scanner;

// 1116 : 사칙연산 계산기
// a와 b에 대한 사칙연산 결과를 양식에 맞추어 출력한다.

public class codeup1116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+ "+" +b +"="+ (a+b));
		System.out.println(a+ "-" +b +"="+ (a-b));
		System.out.println(a+ "*" +b +"="+ (a*b));
		System.out.println(a+ "/" +b +"="+ (a/b));
		
		
	}
}
