package codeup;

import java.util.Scanner;

// 1280 : 홀수는 더하고 짝수는 빼고 2
// 두 자연수 a, b를 입력 받는다. 
// (반드시 a가 b보다 같거나 작게 입력된다.)
//  홀수는 더하고 짝수는 빼는 식을 보여준후 결과를 출력한다.(예시 참고)
// 첫수가 양수일 경우에도 앞에 +를 붙여서 출력.
//단 결과가 양수일 경우에는 +를 붙이지 않는다.

public class codeup1280 {
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
				System.out.print("+"+i);
			}
		}
		System.out.print("="+c);
	}
}
