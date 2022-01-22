package codeup;

import java.util.Scanner;

// 1269 : 수열의 값 구하기
// 시작값 a, b, c, n이 차례대로 입력된다.
// n번째 수열의 값을 출력한다.
public class codeup1269 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			a = a * b + c;
		}
		System.out.println(a);
	}
}
