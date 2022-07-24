package baekjoon;

import java.util.Scanner;

// 2754번
// 학점계산
// 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
// A+: 4.3, A0: 4.0, A-: 3.7
// B+: 3.3, B0: 3.0, B-: 2.7
// C+: 2.3, C0: 2.0, C-: 1.7
// D+: 1.3, D0: 1.0, D-: 0.7
// F: 0.0

public class Baekjoon2754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String score = sc.next();
		double point = 0.0;

		switch (score) {
		case "A+":
			point = 4.3;
			break;
		case "A0":
			point = 4.0;
			break;
		case "A-":
			point = 3.7;
			break;
		case "B+":
			point = 3.3;
			break;
		case "B0":
			point = 3.0;
			break;
		case "B-":
			point = 2.7;
			break;
		case "C+":
			point = 2.3;
			break;
		case "C0":
			point = 2.0;
			break;
		case "C-":
			point = 1.7;
			break;
		case "D+":
			point = 1.3;
			break;
		case "D0":
			point = 1.0;
			break;
		case "D-":
			point = 0.7;
			break;
		case "F":
			point = 0.0;
			break;
		}
		System.out.println(point);
	}
}
