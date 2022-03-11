package codeup;

import java.util.Scanner;

// 1405 : 숫자 로테이션
// 첫째 줄에 숫자의 개수 n이 입력된다.( 1 <= n <= 1,000)
// 둘째 줄에 n개의 정수 k가 공백으로 구분되어 입력된다.(1 <= k <= 1,000)

public class codeup1405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] k = new int[n];
		for (int i = 0; i < k.length; i++) {
			k[i] = sc.nextInt();
		}
		
		for (int i = 0; i < k.length; i++) {
			for (int j = i; j < k.length; j++) {
				System.out.print(k[j]+" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(k[j]+" ");
			}		
			System.out.println();
		}
	}
}
