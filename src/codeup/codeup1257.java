package codeup;

import java.util.Iterator;
import java.util.Scanner;

// 1257 : 두 수 사이의 홀수 출력하기
// 두 수 a, b 가 입력된다. ( a <= b )
// a~b의 홀수를 모두 출력한다.

public class codeup1257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			while(a <= b) {
				if(a % 2 != 0) {
					System.out.print(a + " ");
				}
				a++;
			}
		}
		else if(a > b) {
			while (a >= b) {
				if (b % 2 != 0) {
					System.out.print(b + " ");
				}
				b++;
			}
		} else {
			if (a % 2 != 0)
				System.out.print(a);
		}
		
	}
}
