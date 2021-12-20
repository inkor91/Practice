package codeup;

import java.util.Scanner;
// 1154 : 큰수 - 작은수
// 정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.

public class codeup1154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a-b);
		}else if(a<b) {
			System.out.println(b-a);
		}else {
			System.out.println(a-b);
		}
	}
}
