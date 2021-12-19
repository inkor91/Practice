package codeup;

import java.util.Scanner;

// 1151 : 10보다 작은 수
// 10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
// 10미만이면 small을 출력한다.

public class codeup1151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<10) {
			System.out.println("small");
		}else {
			System.out.println("");
		}
	}
}
