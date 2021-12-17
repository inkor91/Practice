package codeup;

import java.util.Scanner;

// 1140 : 논리 연산자(OR)
// 두 정수가 입력된다.
// 두 정수 중 하나의 값이 참(1) 이면 참(1), 그렇지 않으면 거짓(0)을 출력한다.

public class codeup1140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==1||b==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
