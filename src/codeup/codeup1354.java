package codeup;

import java.util.Scanner;

// 1354 : 삼각형 출력하기 2
// 길이 n이 입력된다.
// 역삼각형을 출력한다.

public class codeup1354 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
