package codeup;

import java.util.Scanner;

// 1508 : 나도 IQ 150 
// 첫 줄에 이 삼각격자의 세로 길이 N이 입력된다.(2 <= N <= 20)
// 둘째 줄부터 N+1째 줄까지 (k, 1)의 격자판의 정보가 입력된다. ( 1 <= k <= N)
// N크기의 삼각 격자판을  출력하시오.

public class codeup1508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[100][100];
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < i+1; j++) {
				arr[i][j] = k;
				if(j >= 1) {
					arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println("");
		}
	}
}