package codeup;

import java.util.Scanner;

// 1851 : [기초-재귀함수] 재귀로 * n개 한 줄로 출력하기
// int 형 정수(n) 1개가 입력된다.
// n 개의 * 을 한 줄로 출력한다.

public class codeup1851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		
		loop(count);
		}
	
		public static void loop(int i) {
			if (i==0) {
				return;
			} else {
				System.out.print("*");
				loop(i-1);
			}
		}
}
