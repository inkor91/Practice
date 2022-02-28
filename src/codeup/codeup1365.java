package codeup;

import java.util.Scanner;

// 1365 : 사각형 출력하기 3
// 별로 사각형을 출력하는 문제이다.
// 하지만 여기서는 대각선을 출력해야한다.
// 프로그램은 다음과 같이 진행된다.
// 1. n이 입력된다.(3<=n<=100)
// 2.대각선이 포함된 n*n사각형을 출력한다.

public class codeup1365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("*"); // 첫째줄 별
		}
		System.out.println();
		for (int i = 1; i < n-1; i++) {
			for (int j = 0; j < n; j++) { //가로 n번반복  
				if(j==0||j==i||j==n-1-i||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {  // 마지막줄 
			System.out.print("*");
		}
	}
}
