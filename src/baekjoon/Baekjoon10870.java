package baekjoon;

import java.util.Scanner;

// 10870��
// �Ǻ���ġ �� 5
// �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. 
// �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
// �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
// n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
// n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Baekjoon10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibonacci(N));
	}
	
	static int fibonacci(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}
