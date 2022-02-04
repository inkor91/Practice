package codeup;

import java.util.Scanner;

// 1281 : 홀수는 더하고 짝수는 빼고 3
// 두 자연수 a, b가 입력된다.(0
// (반드시 a가 b보다 같거나 작게 입력된다.)
//  홀수는 더하고 짝수는 뺀 식을 보여준후 결과를 출력한다.
/// 을 나열할때 양수인 경우 불필요하게 '+'를 붙여서 출력하지 않는다.

public class codeup1281 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;		
		for (int i = a; i<=b; i++) {
			if (i%2 == 0) {
				c = c-i;
				System.out.print("-"+i);
			}else {
				c = c+i;
				if(i==a) {
					System.out.print(i);
				}
				else {
					System.out.print("+"+i);
				}
			}
		}
		System.out.print("="+c);
	}
}
