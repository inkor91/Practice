package baekjoon;

import java.util.Scanner;

// 파일 옮기기
// 두 개의 바구니에 사과와 오렌지가 있다. 첫 번째 바구니에는 사과 A개와 오렌지 B개가 있으며 두 번째 바구니에는 사과 C개와 오렌지 D개가 있다.
// 당신은 한 바구니에 있는 과일 하나를 집어서 다른 바구니로 옮길 수 있다. 이런 식으로 과일을 옮길 때, 한 바구니에는 사과만 있게 하고 다른 쪽에는 오렌지만 있게 하려고 한다.
// 앞서 말한 조건을 만족하도록 과일을 옮길 때, 과일을 옮기는 최소 횟수를 구하는 프로그램을 작성하여라.

public class Baekjoon11943 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫째 바구니
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 둘째 바구니
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		//  경우의 수는 두 개 
        // 1. 첫째바구니 사과 옮기기 + 둘째바구니 오렌지 옮기기 = (A + D)
        // 2. 첫째바구니 오렌지 옮기기 + 둘째바구니 사과 옮기기 = (B + C)
		System.out.println(Math.min(a+d,b+c));
	}
}
