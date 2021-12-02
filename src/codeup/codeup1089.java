package codeup;

import java.util.Scanner;

// 1089 : [기초-종합] 수 나열하기1
// 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
// n번째 수를 출력하는 프로그램을 만들어보자.
public class codeup1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 시작값
		int b = sc.nextInt(); // 등차값
		int c = sc.nextInt(); // n번째 수
		int count = 1;  // c와 비교할 번 수
		
		while(count != c) {
			a += b;  // 시작값 + 등차값
			count++;
		} 
		// while문을 통해 조건에 맞지 않을 때까지 반복 
		// 조건 => count가 i와 같지 않은 경우 
		// 조건에 맞이 낳을 때까지
		// 시작값 a 에 등차값 b를 더한 후 저장
		// count를 1씩 증가 시킴 
		
		// while문의 조건에 맞았을 때 (count가 c와 동일 값일 떄)
		// while문으로 종료하고 a를 출력
		System.out.println(a);
		// 최종적으로 a는 처음 시작값에 등차값 b를 n번째까지 더한 합을 가지고 있다. 
	} 
}
