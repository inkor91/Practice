package baekjoon;

import java.util.Scanner;

// 10872번
// 팩토리얼
// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
// 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
// 첫째 줄에 N!을 출력한다.

public class Baekjoon10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int sum = factorial(N);
		System.out.println(sum);
	}
	
	public static int factorial(int N) {
		if ( N <= 1 ) {
			return 1;
		}
		return N * factorial(N - 1);
	}
}
