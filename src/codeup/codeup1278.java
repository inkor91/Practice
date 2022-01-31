package codeup;

import java.util.Scanner;

// 1278 : 자릿수 계산
// 어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.
// 1이상의 자연수 n이 입력된다. (n은 int 범위)
// 그 숫자가 몇 자릿수 인지 출력하시오.

public class codeup1278 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (int)(Math.log10(n)+1);
		System.out.println(a);
	}
}
