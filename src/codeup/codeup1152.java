package codeup;

import java.util.Scanner;

// 1152 : 10보다 작은 수 (else 버전)
// 10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.
// 10미만 : small 10이상 : big 을 출력한다.

public class codeup1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<10) {
			System.out.println("small");
		}else {
			System.out.println("big");
		}
	}
}
