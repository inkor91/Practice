package baekjoon;

import java.util.Scanner;

// Do Not Touch Anything
// 첫 번째 줄에 좌석의 세로 크기, 가로 크기 R, C와 한 대의 CCTV가 수용할 수 있는 범위 N이 주어진다
// 모든 좌석을 전부 촬영하도록 CCTV를 배치할 때, 필요한 CCTV의 최소 개수를 출력한다.

public class Baekjoon13136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		long x, y;

		if (r % n > 0) {
			x = r / n + 1;
		} else {
			x = r / n;
		}

		if (c % n > 0) {
			y = c / n + 1;
		} else {
			y = c / n;
		}

		System.out.println(x * y);
	}
}
