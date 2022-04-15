package codeup;

import java.util.Scanner;

// 1707 : 10명의 점수 평균
// 10명의 점수를 입력받는다.(점수의 범위는 0~100이다.)
//   첫줄에 평균을 출력하고, 다음 줄에 평균이상인 사람의 수와 평균미만인 사람의 수를 출력한다.
// 평균은 소수 첫째자리까지 출력한다.

public class codeup1707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		double total = 0.0;
		
		for (int i = 0; i < 10; i++) {
			int grade = Integer.parseInt(sc.next());
			total += grade;
			score[i] = grade;
		}  
		
		double avg = total/10.0;
		System.out.println(avg);
		
		int higher = 0;
		for (int i = 0; i < 10; i++) {
			if(score[i]>=avg) {
				higher++;
			}
		}
		System.out.println(higher+" "+(10-higher));
	}
}
