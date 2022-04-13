package codeup;

import java.util.Scanner;

// 1703 : 초를 시/분/초로 변환
// 초가 입력된다.
// 공백을 기준으로 시, 분, 초의 형태로 출력한다.

public class codeup1703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int hour = 0;
		int minute = 0;
		int seconds = 0;
		hour = total/3600;
		minute = (total-hour*3600)/60;
		seconds = total%60;
		
		System.out.println(hour+" "+minute+" "+seconds);
	}
}
