package baekjoon;

import java.util.Scanner;

// 수학은 체육과목 입니다 2

// 첫 번째 줄에 자연수 n (1 ≤ n ≤ 109)이 주어진다.
// 첫 번째 줄에 19번 문제 세 번째 줄에 등장하는 수 '1000'을 자연수 n으로 바꾸었을 때 
// 그에 해당하는 답의 번호를 출력한다. 즉, 1 이상 5 이하의 자연수 중 하나를 출력해야 한다.

public class Baekjoon17362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n %= 8;
        System.out.println(n > 5 || n == 0 ? (10 - n) % 8 : n);
	}
}
