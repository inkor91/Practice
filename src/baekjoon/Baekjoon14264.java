package baekjoon;

import java.util.Scanner;

// 정육각형과 삼각형
// 한 변의 길이가 L인 정육각형을 가지고 있다. 오늘은 이 정육각형에 세 개의 겹치지 않는 대각선을 그리려고 한다.
// 대각선은 정육각형을 4개의 삼각형으로 나눈다. 4개의 삼각형 중에 면적이 제일 작은 삼각형의 면적을 S라고 한다.
// 가능한 S중에서 최댓값을 구하는 프로그램을 작성하시오.

// 첫째 줄에 정육각형 한 변의 길이 L이 주어진다. 
// 첫째 줄에 S의 최댓값을 출력한다. 절대/상대 오차는 10-9까지 허용한다.

public class Baekjoon14264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		
		//루트는 Maht.sqrt 제곱은 Math.pow 
		double s = (Math.sqrt(3)/4) * Math.pow(n, 2);
		
		System.out.println(s);
	}
}
