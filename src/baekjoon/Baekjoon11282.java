package baekjoon;

import java.util.Scanner;

// 한글
// 첫째 줄에 N(1 ≤ N ≤ 11,172)이 주어진다.
// 첫째 줄에 N번째 글자를 출력한다. 문자열의 인코딩은 UTF-8을 사용해야 한다

public class Baekjoon11282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n += 44031;
		char C = (char)n;
		System.out.println(C);
	}
}
