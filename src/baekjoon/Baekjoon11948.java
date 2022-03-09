package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 과목선택
// JOI는 물리, 화학, 생물, 지구과학, 역사, 지리 총 6 과목의 시험을 봤다. 각 시험의 만점은 100점이다.
// JOI는 물리, 화학, 생물, 지구과학 4과목 중에서 3 과목을 선택하고 역사, 지리 2 과목 중에서 한 과목을 선택한다.
// 시험 점수의 합이 가장 높게 나오도록 과목을 선택할 때, JOI가 선택한 과목의 시험 점수의 합을 구하시오.

public class Baekjoon11948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int sum1 = 0;
		
		int[] total = new int[] {A,B,C,D};
		Arrays.sort(total);
		sum1 = total[1]+total[2]+total[3];
		
		int E = sc.nextInt();
		int F = sc.nextInt();
		int sum2 = Math.max(E, F);
		System.out.println(sum1+sum2);
	}
}
