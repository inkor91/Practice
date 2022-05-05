package baekjoon;

import java.util.Scanner;

// 벌집
// 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
// 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

public class Baekjoon2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int range = 2;

		if (N == 1) {
			System.out.println(1);
		}

		else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
