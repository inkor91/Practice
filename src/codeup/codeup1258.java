package codeup;

import java.util.Scanner;

// 1258 : 1부터 n까지 합 구하기
// 입력으로 자연수 n이 입력된다.
// 1부터 n까지의 합을 출력한다.
public class codeup1258 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
