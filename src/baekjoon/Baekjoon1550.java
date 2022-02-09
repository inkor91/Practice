package baekjoon;

import java.util.Scanner;

// 16진수
// 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.


public class Baekjoon1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(Integer.parseInt(a,16));
	}
}
