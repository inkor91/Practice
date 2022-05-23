package codeup;

import java.util.Scanner;

public class codeup1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] arr = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = n*(j+1)-i;
				System.out.print(String.valueOf(arr[i][j]+" "));
			}
			System.out.println();
		}
	}
}
