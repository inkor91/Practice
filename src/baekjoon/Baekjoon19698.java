package baekjoon;

import java.util.Scanner;

// 헛간 청약
// 소들의 수 N, 헛간의 크기 W x H를 나타내는 두 정수 W와 H, 그리고 소들에게 배정되는 공간의 크기 L이 순서대로 주어진다.

public class Baekjoon19698 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		int cow = (W/L) * (H/L);
		
		if(cow >= N) {
			System.out.println(N);
		}else {
			System.out.println(cow);
		}
	}
}
