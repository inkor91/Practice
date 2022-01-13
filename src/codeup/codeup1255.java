package codeup;

import java.util.Scanner;

// 1255 : 두 실수 사이 출력하기
// 두 실수 a와 b가 입력된다. (a <= b) 
// a와 b사이의 수를 0.01간격으로 오름차순으로 출력하시오.

public class codeup1255 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		while (a <= b) {
			System.out.printf("%.2f ", a);
			a = a + 0.01;
		}
	}
}
