package codeup;

import java.util.Scanner;

// 1367 : 평행사변형 출력하기 1
// 평행사변형의 높이 n이 주어진다.
// 옆 면이 대각선으로 이루어지는 평행사변형을 출력한다.
// 단,공백은 왼쪽 위에 있다.

public class codeup1367 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-(i+1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
