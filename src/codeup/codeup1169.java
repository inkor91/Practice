package codeup;

import java.util.Scanner;

// 1169 : 나이 계산 2
// 나이가 입력으로 주어진다.(정수, 나이는 113살 이하만 입력으로 들어온다.)
// 출생년도 뒤의 두자리와 연도정보(1이면 1900년대, 3이면 2000년대)를 출력한다.
// (단, 출생년도 뒤 2자리가 10보다 작을 경우10의자리에 0은 붙이지 않고 출력한다.)
// 예) 2009년생이라면 9 3 을 출력함. (09 3 이 아님)
// ※ 나이는 2012년도 기준입니다.

public class codeup1169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int y = 0;
		int d = 0;
		int result = 0;
		
		if(a>13) {
			y= 113-a;
			d=1;
		}else if(a<=13) {
			y=13-a;
			d=3;
		}
		System.out.println(String.valueOf(y)+" "+String.valueOf(d));
			
	}
}
