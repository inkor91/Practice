package codeup;

import java.util.Scanner;

// 1371 : 마름모 출력하기
// n이 입력되면 대각선 2개의 길이가 2n인 마름모를 출력하시오.
// 정수 n이 입력된다
// 대각선 2개의 길이가 2n인 마름모를 출력한다.

public class codeup1371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j =2*(n-i);j<2*n;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=2;j<2*(n-i);j++) {
				System.out.print(" ");
			}
			System.out.print("*");			
			System.out.println();
		}
	}
}
