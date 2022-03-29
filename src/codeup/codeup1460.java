package codeup;

import java.util.Scanner;

// 1460 : [기초-배열연습] 2차원 배열 순서대로 채우기 1-1
// 첫 번째 줄에 배열의 크기 n이 입력된다.
// n*n 크기의 배열을 설명과 같이 채워 출력한다.

public class codeup1460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		int c=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]+=c;
				System.out.print(arr[i][j]+" ");
				c++;
			}
			System.out.println();
		}
	}
}
