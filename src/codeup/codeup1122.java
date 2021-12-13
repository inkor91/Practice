package codeup;

import java.util.Scanner;

// 1122 : 초를 분/초로 변환
// 초를 입력받아 분 / 초의 형태로 출력하시오.
//예) 60  ====>   1 0    (1분 0초를 뜻함)
//70    ====>    1  10       (1분 10초를 뜻함)
public class codeup1122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int min = num/60;
		int sec = num%60;
		System.out.println(min + " " + sec);
	}
}
