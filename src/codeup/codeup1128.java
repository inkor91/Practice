package codeup;

import java.util.Scanner;

// 1128 : n * 123456789
// n이 입력되면 n×123456789 의 결과를 출력하시오.
// 이 문제는 다음 키워드를 사용하지 못한다.
// 금지 키워드 : long double float

public class codeup1128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String num2 = String.valueOf(num*123456789L) ;
		System.out.println(num2);
	}
}
