package baekjoon;

import java.util.Scanner;

// 저작권
// 첫째 줄에 앨범에 수록된 곡의 개수 A와 평균값 I가 주어진다
// 첫째 줄에 적어도 몇 곡이 저작권이 있는 멜로디인지 출력

// 올림한 평균값(A) = 저작권이 있는 멜로디의 개수(C) / 앨범에 수록된 곡의 개수(M)
// A와 M 값을 통해 C값(최소값)을 구해야한다. 단, A는 올림한 값이기때문에 범위를 지정
// A - 1 < C/M <= A
// M(A - 1) < C <= MA
// C의 최소값은 M(A - 1)이 정수이기 때문에 (M(A - 1) + 1

public class Baekjoon2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int song = sc.nextInt(); 
		int avg = sc.nextInt(); 
		int i = (avg - 1) * song + 1; 
		System.out.println(i); 
	}
}
