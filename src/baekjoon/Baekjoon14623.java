package baekjoon;

import java.util.Scanner;

// 감정이입
// 첫 번째 줄에 이진수 B1이 주어진다. 두 번째 줄에 이진수 B2가 주어진다. 
// 입력으로 주어지는 두 이진수의 길이는 1 이상 30 이하의 자연수이다. 
// 또한 두 이진수들이 1로 시작하는 것이 보장된다.
// 첫 번째 줄에 입력으로 주어진 두 이진수 B1, B2의 곱을 이진수로 출력한다. 
// 출력하는 이진수 앞에 불필요한 0이 붙으면 안 됨에 주의해야 한다. 
// 즉 출력하는 이진수의 시작은 항상 1이어야 한다.

public class Baekjoon14623 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String B1 = sc.nextLine();
		String B2 = sc.nextLine();
		
		long B1n = Long.parseLong(B1, 2);
		long B2n = Long.parseLong(B2, 2);
		
		String sum = Long.toBinaryString(B1n * B2n);
		
		System.out.println(sum);
	}
}
