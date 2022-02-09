package baekjoon;

import java.util.Scanner;

// 검증수
// 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
// 첫째 줄에 검증수를 출력한다.

public class Baekjoon2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int sum = 0;
		
		for(int i=0; i< 5; i++) {
			int t = sc.nextInt();
			sum += t*t;
		}
		
		int result = sum % 10;
		System.out.println(result);

	}
}
