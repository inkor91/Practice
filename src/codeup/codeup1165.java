package codeup;

import java.util.Scanner;

// 1165 : 축구의 신 1
// 현재 경기시간과 우리팀의 득점이 입력으로 주어진다.(정수)
// 경기가 끝났을때 우리팀의 득점을 출력한다.

public class codeup1165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score = sc.nextInt();
		
		for(int i = time; i < 90; i+=5 ) {
			score++;
		}
		System.out.println(score);
	}
}
