package baekjoon;

import java.util.Scanner;

// 스타후르츠

// 첫 번째 줄에 여름의 일 수 N과 스타후르츠가 자라는데 걸리는 일 수 T와 
// 스타후르츠를 심을 수 있는 칸의 수와 스타후르츠 개당 가격 정수 P가 주어집니다.

// 첫 번째 줄에 진수가 여름 동안 스타후르츠를 팔아 벌 수 있는 수익을 출력합니다.

public class Baekjoon17496 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int N = sc.nextInt();
	     int T = sc.nextInt();
	     int C = sc.nextInt();
	     int P = sc.nextInt();
	     System.out.println((N-1) / T * C * P);
	}
}
