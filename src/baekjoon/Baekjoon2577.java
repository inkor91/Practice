package baekjoon;

import java.util.Scanner;


// 숫자의 개수

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

// 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

public class Baekjoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value);
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
