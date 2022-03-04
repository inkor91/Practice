package codeup;

import java.util.Scanner;

// 1370 : 지그재그 출력하기
//높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.
//예) 3 2

//*
// *
//  *
//  *
// *
//*
// *
//  *
// *
//*

public class codeup1370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int k=0;k<b;k++) {
			for(int i=0;i<a;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for(int i=a-2;i>=0;i--) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
