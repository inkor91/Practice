package codeup;

import java.util.Scanner;

// 1859 : [기초-재귀함수] 별 삼각형 출력하기
// int 형 정수(n) 1개가 입력된다. (1 <= n <= 30)
// n 층의 별 삼각형을 출력한다.

public class codeup1859 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		
		enter(line);
	}
	
	public static void enter(int line) {
		if (line<=0) {
			return;
		}
		
		enter(line-1);
		loop(line);
		System.out.println();
	}
	
	public static void loop(int line) {
		if (line<=0) {
			return;
		}
		loop(line-1);
		System.out.print("*");
	}
}
