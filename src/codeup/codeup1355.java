package codeup;

import java.util.Scanner;

// 1355 : 삼각형 출력하기 3
// 길이 n이 입력된다.
// 역삼각형을 출력한다.

public class codeup1355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
