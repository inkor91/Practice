package codeup;

import java.util.Scanner;

// 1351 : 구구단 출력하기 2
// 시작 단과 마지막 단을 입력

public class codeup1351 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
