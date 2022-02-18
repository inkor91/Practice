package codeup;

import java.util.Scanner;

// 1352 : 사각형 출력하기 1
// 길이 n이 입력되면 길이가 n인 사각형을 출력하시오.
// 단, 사각형은 * 모양으로 채운다.

public class codeup1352 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
