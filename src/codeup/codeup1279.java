package codeup;

import java.util.Scanner;

// 1279 : 홀수는 더하고 짝수는 빼고 1
// 두 자연수 a, b를 입력 받는다. 
// (반드시 a가 b보다 같거나 작게 입력된다.)
// a, b 사이의 수 중 홀수는 더하고 짝수는 뺀 결과를 출력하시오.
public class codeup1279 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;		
		for (int i = a; i<=b; i++) {
			if (i%2 == 0) {
				c = c-i;
			}else {
				c = c+i;
			}
		}
		System.out.println(c);
	}
}
