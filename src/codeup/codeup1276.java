package codeup;

// 1276 : 팩토리얼 계산
// 자연수 n이 입력된다. (n <= 12)
// n!의 값을 출력한다.

import java.util.Scanner;

public class codeup1276 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= 1;
		for(int i=1; i<=n; i++) {
			a = a*i;
		}
		System.out.println(a);
	}
}
