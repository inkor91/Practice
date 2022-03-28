package codeup;

import java.util.Scanner;

// 1440 : 비교
// 첫째 줄에 숫자의 개수 n이 입력된다. ( 2 <= n <= 1000)
// 다음 줄에 n개의 숫자 k가 공백으로 입력된다.( k는 int범위)

public class codeup1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + ": ");
			for (int j = 0; j < n; j++) {
				if (num[i] < num[j] && i != j) {
					System.out.print("< ");
				} else if (num[i] == num[j] && i != j) {
					System.out.print("= ");
				} else if (num[i] > num[j] && i != j) {
					System.out.print("> ");
				}
			}
			System.out.println("");
		}
	}
}
