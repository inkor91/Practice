package codeup;

import java.util.Scanner;

// 1357 : 삼각형 출력하기 4
// n이 입력되면 다음 삼각형을 출력하시오.
//예) n = 4

//*
//**
//***
//****
//***
//**
//*

public class codeup1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i;  j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
