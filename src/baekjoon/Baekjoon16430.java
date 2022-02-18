package baekjoon;

import java.util.Scanner;

// 제리와 톰
// 톰은 마트에서 치즈 1kg 을 사서 집으로 돌아왔습니다.
// 그런데 톰이 한눈을 판 사이 제리가 와서 A/B kg 만큼 훔쳐갔습니다.
// 제리가 치즈를 훔쳐 간 후 톰이 가지고 있는 치즈의 무게는 얼마인가요?
// 첫 번째 줄에 두 정수 A, B (1 ≤ A < B ≤ 9) 가 주어집니다. A와 B는 서로소임이 보장됩니다.

public class Baekjoon16430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((b-a)+" "+ b);
	}
}
