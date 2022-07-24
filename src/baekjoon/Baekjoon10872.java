package baekjoon;

import java.util.Scanner;

// 10872��
// ���丮��
// 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
// ù° �ٿ� N!�� ����Ѵ�.

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
