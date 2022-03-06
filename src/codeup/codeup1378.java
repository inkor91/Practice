package codeup;

import java.util.Scanner;

// 동렬이는 수학 문제를 풀다 다음과 같은 수열을 보았다.
// Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)
// 임의의 정수 n이 주어질 때 이 수열의 합 Sn을 구하는 프로그램을 작성하시오.
// 수열의 합 Sn의 값을 출력한다

public class codeup1378 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
	}
}
