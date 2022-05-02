package codeup;

import java.util.Scanner;

// 1852 : [기초-재귀함수] 재귀로 1부터 n까지 한 줄로 출력하기 
// int 형 정수(n) 1개가 입력된다.
// 1 부터 n 까지 수를 공백을 두고 한 줄로 출력한다.

public class codeup1852 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		
		loop(1,count);
	}
	
	public static void loop(int start, int end) {
		if (start > end) {
			return;
		} else {
			System.out.print(start + " ");
			loop(start+1, end);
		}
	}
}
