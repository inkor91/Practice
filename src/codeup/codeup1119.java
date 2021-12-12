package codeup;

import java.util.Scanner;

// 1119 : 일을 시간으로 변환
// 하루는 24시간이다.
// 일(day)이 입력으로 주어지면 시간으로 변환하시오.
public class codeup1119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		System.out.println(day*24);
	}
}
