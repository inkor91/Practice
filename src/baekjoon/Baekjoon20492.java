package baekjoon;

import java.util.Scanner;

// 세금
// 대회 상금의 금액이 주어질 때, 다음 두 경우 각각에 대해 이 학생이 실제로 수령하는 금액을 구해보자.
// 1. 전체 상금의 22%를 제세공과금으로 납부하는 경우
// 2. 상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우
// 1번 경우에 대한 답과 2번 경우에 대한 답을 사이에 공백을 두고 출력한다.

public class Baekjoon20492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int case1 = (int) (p*0.78);
		int case2 =  (int) ((p*0.80)+(p*0.20*0.78));
		System.out.println(case1+" "+case2);
	}
}
