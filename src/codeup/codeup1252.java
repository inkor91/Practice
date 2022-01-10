package codeup;

import java.util.Scanner;

// 1252 : 1 부터 n 까지 출력하기
//  어떤 수 n을 입력으로 받아 1부터 n까지의 숫자를 출력하시오.
// n이 입력으로 들어온다. (1 <= n <= 100000)
// 1부터 n까지 공백으로 띄워 출력한다.

public class codeup1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf(i +" ");
		}
	}
}
