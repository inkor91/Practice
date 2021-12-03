package codeup;

import java.util.Scanner;

//1090 : [기초-종합] 수 나열하기2

public class codeup1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long r = sc.nextLong();
		long n = sc.nextLong();
		
		// for문을 통해 i가 n보다 작을때까지 반복 > 시작값 a에 등비값 r를 곱한후 저장
		for(long i=1; i<n; i++) {
			a *= r;
		}
		// for문의 i가 n보다 작지않을 경우(=n번 반복했을 경우) > a의 값을 출력
		System.out.println(a);
	}
}
