package codeup;

import java.util.Scanner;

// 1259 : 1부터 n까지 중 짝수의 합 구하기
// 자연수 n이 입력으로 주어진다
// 1부터 n까지의 짝수의 합을 출력하시오.

public class codeup1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
				if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);		
	}
}
