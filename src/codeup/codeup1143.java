package codeup;

import java.util.Scanner;

// 1144 : 비트 연산자(OR)
// 두 정수가 입력된다.(int범위)
// 두 정수를 비트단위로 OR 연산한 후 결과를 10진수로 출력한다.
public class codeup1143 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d", a|b);
		
	}
}
