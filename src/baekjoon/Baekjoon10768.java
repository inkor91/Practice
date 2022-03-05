package baekjoon;

import java.util.Scanner;

// 특별한 날 
// 2월 18일은 올해 CCC에 있어서 특별한 날이다.
//사용자로부터 정수인 월과 일을 입력받아 날짜가 2월 18일인지 전인지 후인지를 출력하는 프로그램이다.
//만약 날짜가 2월 18일 전이면, "Before"을 출력한다. 
//만약 날짜가 2월 18일 후면, "After"을 출력한다. 만약 2월 18일이라면 "Special" 을 출력한다.

public class Baekjoon10768 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		if(m<2) {
			System.out.println("Before");
		}else if(m==2) {
			if(d<18) {
				System.out.println("Before");
			}else if(d>18) {
				System.out.println("After");
			}else {
				System.out.println("Special");
			}
		}else {
			System.out.println("After");
		}
	}
}
