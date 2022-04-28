package codeup;

import java.util.Scanner;

public class codeup1501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][]b = new int[51][51];
		int c = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				b[i][j] = c++;
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
