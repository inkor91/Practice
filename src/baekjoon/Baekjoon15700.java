package baekjoon;

import java.util.Scanner;

// 타일 채우기 4
// N×M 크기의 벽에 2×1, 1×2 크기의 타일을 채우려고 한다. 
// 겹치지 않게 놓는다면, 최대 몇 개를 채울 수 있을까?
// 첫째 줄에 N과 M이 주어진다.
// 첫째 줄에 채울 수 있는 타일 개수의 최댓값을 출력한다.

public class Baekjoon15700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		System.out.println(x*y/2);
	}
}
