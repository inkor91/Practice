package codeup;

import java.util.Scanner;

// 1161 : 홀수와 짝수 그리고 더하기
// 정수 두개가 입력된다.
// 만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
// 그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 
// 결과로 나오는 값이 홀수인지 짝수인지 출력한다.
public class codeup1161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		 if(a % 2 == 0 && b % 2 == 0) {
	            System.out.println("짝수+짝수=짝수");
	        } else if(a % 2 == 1 && b % 2 == 0) {
	            System.out.println("홀수+짝수=홀수");
	        } else if(a % 2 == 0 && b % 2 == 1) {
	            System.out.println("짝수+홀수=홀수");
	        } else {
	            System.out.println("홀수+홀수=짝수");
	        }
			
	}
}
