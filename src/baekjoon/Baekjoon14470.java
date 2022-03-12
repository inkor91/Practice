package baekjoon;

import java.util.Scanner;

// 전자레인지

// 입력은 총 5줄로, 한 줄에 한 개씩의 정수가 주어진다.
// 첫 줄에는 원래의 고기의 온도 A가 주어진다. 단, A는 -100 이상 100 이하이며, 0이 아니다.
// 둘째 줄에는 목표 온도 B가 주어진다. 단, B는 1 이상 100 이하이며, A보다 크다.
// 셋째 줄에는 얼어 있는 고기를 1℃ 데우는 데 걸리는 시간 C가 주어진다.
// 넷째 줄에는 얼어 있는 고기를 해동하는 데 걸리는 시간 D가 주어진다.
// 다섯째 줄에는 얼어 있지 않은 고기를 1℃ 데우는 데 걸리는 시간 E가 주어진다.
// C, D, E는 모두 1 이상 100 이하이다.
// 고기를 B℃로 데우는 데 걸리는 시간을 초 단위로 한 줄에 출력하라.

public class Baekjoon14470 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int sum = 0;
		if(A<0) {
			sum = (Math.abs(A)*C)+D+(B*E);
		}else if(A==0) {
			sum = D + (B*E);
		}else {
			sum = (B-A)*E;
		}
		System.out.println(sum);
	}
}
