package codeup;

import java.util.Scanner;

// 1260 : 3의 배수의 합
// 자연수 n이 입력으로 주어진다
// a~b까지의 수 중 3의 배수의 합을 출력한다.

public class codeup1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
				if(i%3==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);		
	}
}
