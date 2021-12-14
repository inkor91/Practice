package codeup;

import java.util.Scanner;

// 1127 : 성적 계산
// 철수는 자신의 성적을 꼼꼼하게 관리한다.
// 매번 시험을 치고 나면 자신의 성적을 기록해 놓고 기말고사가 끝나면 중간고사, 기말고사, 수행평가의 점수를 반영비율에 맞게 합산한다.
//최근에 프로그래밍 수행평가를 치고 프로그래밍 과목의 점수를 계산하게 되었다.
//반영비율을 알고 있고 각각의 점수를 알고 있다면 이 과목의 점수는 다음과 같이 계산할 수 있다.

// ① 반영 비율과 받은 점수를 입력한다.
// ② 입력 순서는 중간고사 반영비율, 중간고사 점수, 기말고사 반영비율, 기말고사 점수, 수행평가 반영비율, 수행평가 점수 순이다.
// ③ 반영비율은 실수형, 각 점수는 정수형으로 입력한다.

//  결과를 실수로 출력하되 소수 첫째 자리까지 출력한다.

class Score{
	double scoreRate; // 반영비율
	int score; // 점수
	
	public double result() {
		return scoreRate*score; // 결과값
	}
}

public class codeup1127 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Score[] score = new Score[3]; 
		for (int i = 0; i < score.length; i++) {
			score[i] = new Score();
			score[i].scoreRate = sc.nextDouble();  // 반영비율 입력
			score[i].score = sc.nextInt(); // 점수 입력
		}
		
		double total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i].result();
		}
		System.out.printf("%.1f", total);
	}
}

