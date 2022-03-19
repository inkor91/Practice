package baekjoon;

import java.util.Scanner;

// 자연수 A, B가 주어지면 A+B를 구하는 프로그램을 작성하시오.
// 첫 번째 줄에 A+B의 값을 출력한다.

public class Beakjoon15873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = (num / 10) + (num % 10);
		
		if (num / 10 > 10) {
			res = (num / 100) + (num % 100);
		}
		
		if ( num == 1010) {
			res = 20;
		}
		
		System.out.println(res);
	}
}
