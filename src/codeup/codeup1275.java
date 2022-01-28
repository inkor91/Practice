package codeup;

import java.util.Scanner;

// 1275 : k 제곱 구하기
// 공백을 기준으로 n과 k가 주어진다. (n은 0이 아닌 정수, k>=0) 
// nk의 결과를 출력한다.
public class codeup1275 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a= 1;
		for (int i = 0; i < k; i++) {
			a = a * n;
		}
		System.out.println(a);
	}
}
