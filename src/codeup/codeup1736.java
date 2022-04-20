package codeup;

import java.util.Scanner;

// 1736 : 초를 일/시/분/초로 변환하기
// 초가 정수로 입력된다.
// (입력 범위:0~100,000,000)
// 일 / 시 / 분 / 초의 형태로 변환해서 출력한다.

public class codeup1736 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seconds = Integer.parseInt(sc.next());
		
		int day = seconds/3600/24;
		seconds -= day*3600*24;
		
		int hour = seconds/3600;
		seconds -= hour*3600;
		
		int min = seconds/60;
		seconds = seconds%60;
		
		System.out.println(day + " " + hour + " " + min + " " + seconds);
	}
}
