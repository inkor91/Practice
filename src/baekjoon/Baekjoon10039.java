package baekjoon;

import java.util.Scanner;

// 평균 점수입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
// 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다. 
// 첫째 줄에 학생 5명의 평균 점수를 출력한다.

public class Baekjoon10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int total = 0;
		for (int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			total +=score[i];
		}
		System.out.println(total/5);
	}
}
