package codeup;

import java.util.Scanner;

// 1359 : 숫자 피라미드 1
// 길이 n이 입력된다
// 숫자 피라미드를 출력한다.

public class codeup1359 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
