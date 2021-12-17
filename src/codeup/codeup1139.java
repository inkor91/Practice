package codeup;

import java.util.Scanner;

// 1139 : 논리 연산자(AND)
// 두 정수가 입력된다.
// 두 정수의 값이 모두 참(1) 이면 참(1), 하나라도 거짓(0)이면 거짓(0)을 출력한다.

public class codeup1139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==1&&b==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
