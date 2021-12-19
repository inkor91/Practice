package codeup;

import java.util.Scanner;

// 1150 : 세 수 중 가장 작은 수
// 세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
// 가장 작은 값을 출력한다.

public class codeup1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=b && a<=c) {
			System.out.println(a);
		}else if(b<=a && b<=c ) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
