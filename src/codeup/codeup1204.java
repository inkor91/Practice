package codeup;

import java.util.Scanner;

// 1204 : 영어 서수로 표현하기
// 1~99 중 한 정수가 입력된다.
// 입력된 정수의 영어 서수 표현을 출력한다.

public class codeup1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n);
		
		int n_last = n%10;
		if(n==11 || n==12 || n==13)
			System.out.println("th");
		else if(n_last==1)
			System.out.println("st");
		else if(n_last==2)
			System.out.println("nd");
		else if(n_last==3)
			System.out.println("rd");
		else
			System.out.println("th");
	}
}
