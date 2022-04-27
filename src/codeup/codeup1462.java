package codeup;

import java.util.Scanner;

// 1462 : [기초-배열연습] 2차원 배열 순서대로 채우기 1-3
// 첫 번째 줄에 배열의 크기 n이 입력된다.
// [입력값의 정의역]
// 1<= n <= 100
// n*n 크기의 배열을 설명과 같이 채워 출력한다.

public class codeup1462 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c=1;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j]+=c;
				System.out.print(b[i][j]+" ");
				c+=a;
			}
			c=i+2;
			System.out.println();
		}
	}
}
