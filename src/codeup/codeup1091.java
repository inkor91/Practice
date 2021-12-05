package codeup;

import java.util.Scanner;

// 1091 : [기초-종합] 수 나열하기3
// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
//n번째 수를 출력하는 프로그램을 만들어보자.
public class codeup1091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// a, m , d는 -50 ~ 50 / n 은 10이하 
		long a = sc.nextLong(); // 시작값
		int m = sc.nextInt();  // 곱할 값
		int d= sc.nextInt(); // 더할 값
		int n = sc.nextInt(); // n번째
		
		
		for(long i=1; i<n; i++) {
			a = a * m + d;
		}
	
		System.out.println(a);
	}
}

