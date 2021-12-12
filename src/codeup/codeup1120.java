package codeup;

import java.util.Scanner;


// 1120 : 세 수의 평균

// 세 정수가 입력되면 평균을 출력하시오.
// 세 수의 평균을 소수 둘째자리까지 출력하시오.

public class codeup1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		double result = (a+b+c)/3.0;
		
		System.out.printf("%.2f", result);
				
		
	}
}
