package codeup;

import java.util.Scanner;

// 1271 : 최대값 구하기
// 첫째줄에 정수의 개수 N이 주어진다. (n<=1000)
// 둘째줄에 N개의 정수가 공백으로 분리되어 주어진다.  ( 0 <= 각각의 데이터 <=1000000 )
// N개의 정수 중 최대값을 찾아 출력한다.

public class codeup1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		for (int i =0; i<n; i++) {
			if( max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
