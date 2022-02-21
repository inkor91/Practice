package baekjoon;

import java.util.Scanner;

// 사파리월드
// 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
// 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.

public class Baekjoon2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(Math.abs(a-b));
	}
}
