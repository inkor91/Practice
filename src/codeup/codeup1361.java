package codeup;

import java.util.Scanner;

// 1361 : 별 계단 만들기
// n이 입력되면 n층의 별 계단을 출력하시오.
// 예) n= 5인 경우,
//**
// **
//  **
//   **
//    **
public class codeup1361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
