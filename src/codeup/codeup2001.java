package codeup;

import java.util.Scanner;

public class codeup2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int[] pasta = new int[3];
		for(int i = 0; i < 3; i++) {
			pasta[i] = sc.nextInt();
		}
		int[] juice = new int[2];
		for(int i = 0; i < 2; i++) {
			juice[i] = sc.nextInt();
		}
		int sum = 0;

		double min = 10000;
		for(int i = 0; i < 3; i++) {
			for(int j= 0; j < 2; j++) {
				sum = pasta[i] + juice[j];
				
				if(min > sum) {
					min = sum;
				}
			}
		}
		min = (double)min * 1.1; 
		System.out.printf("%.1f", min);		
	}
}