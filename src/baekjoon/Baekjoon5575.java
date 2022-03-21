package baekjoon;

import java.util.Scanner;

// 타임 카드
// JOI 상사는 직원의 근무시간을 타임 카드로 관리하고있다. 직원들은 전용 장비를 사용하여 타임 카드에 출근 시간을 기록한다. 근무를 마치고 퇴근할 때도 타임 카드에 퇴근 시간을 기록한다. 타임카드에서 사용하는 시간단위는 24 시간제를 사용한다.
//보안상의 이유로 직원들의 출근 시간은 7시 이후이다. 또한, 모든 직원은 23시 이전에 퇴근한다. 직원의 퇴근 시간은 항상 출근 시간보다 늦다.
//입력으로 JOI 상사의 3 명의 직원 A 씨, B 씨, C 씨의 출근 시간과 퇴근 시간이 주어 졌을 때 각 직원의 근무시간을 계산하는 프로그램을 작성하라.
// 첫 번째 줄에 A 씨의 근무 시간,
// 두 번째 줄에 B 씨의 근무 시간,
// 세 번째 줄에 C 씨의 근무 시간을 출력하라.
// 근무 시간이 h 시간 m 분 s 초이면 h, m, s의 순으로 공백으로 분리하여 출력하라.

public class Baekjoon5575 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int s1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int s2 = sc.nextInt();
			int start = (h1*3600)+(m1*60)+s1;
			int end = (h2*3600)+(m2*60)+s2;
			int t = end - start;
			int h = t/3600;
			int m = (t%3600)/60;
			int s = (t%3600)%60;
			
			System.out.println(h+ " " + m + " " + s);
		}
	}
}
