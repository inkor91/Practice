package codeup;

import java.util.Scanner;

// 1201 : 정수 판별
// 정수 하나가 입력된다.
// 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.
public class codeup1201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<0) {
			System.out.println("음수");
		}else if(a==0) {
			System.out.println(0);
		}else {
			System.out.println("양수");
		}
	}
}
