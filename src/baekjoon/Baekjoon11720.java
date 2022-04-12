package baekjoon;

// 숫자의 합 
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
// 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.

import java.util.Scanner;

public class Baekjoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[]b = sc.next().split("");
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(b[i]);
		}
		
		System.out.println(sum);
	}
}
