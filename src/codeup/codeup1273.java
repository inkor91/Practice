package codeup;

import java.util.Scanner;

// 1273 : 약수 구하기
// 자연수 N이 입력된다.( 1 <= N <= 10,000 )
// N의 약수를 오름차순으로 출력한다.
public class codeup1273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(n%i ==0) {
				System.out.print(i+" ");
			}
		}
	}
}
