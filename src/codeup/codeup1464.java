package codeup;

import java.util.Scanner;

public class codeup1464 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = new String[2];
		strArr = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		int sum = n * m;
		
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sum;
				System.out.print(String.valueOf(arr[i][j]+" "));
				sum--;
			}
			System.out.println();
		}
		
	}
}
