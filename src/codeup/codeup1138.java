package codeup;

import java.util.Scanner;

// 1138 : 논리 연산자(NOT)
// 0또는 1이 입력된다.
// 입력된 논리값의 반대로 출력한다.

public class codeup1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println(1);
		}else if(a==1) {
			System.out.println(0);
		}
				
	}
}
