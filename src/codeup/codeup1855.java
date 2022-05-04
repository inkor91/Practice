package codeup;

import java.util.Scanner;

//1855 : [기초-재귀함수] 재귀로 n번째 피보나치 수 리턴하기

public class codeup1855 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		loop(0 , count , 1 ,2);
	}
	
	public static void loop (int index, int count, int bef, int aft) {
		if (count==1 || count==2) {
			System.out.println(1);
			return;
		}
		
		if (index+4>=count) {
			System.out.println(bef+aft);
		} else {
			loop(index+1, count, aft, bef+aft);
		}
	}
}
