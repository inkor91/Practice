package baekjoon;

import java.util.Scanner;

public class Baekjoon15963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if (N == M) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
