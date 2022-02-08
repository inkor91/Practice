package codeup;

import java.util.Scanner;

// 1287 : 구구단을 *로 출력하기
// 구구단을 입력받아 *로 출력하라.
// n단이 입력된다.
// 출력예시를 참고하여 구구단을 *로 출력한다.

public class codeup1287 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < i*a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
