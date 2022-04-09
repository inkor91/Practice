package baekjoon;

// 문자열 반복
// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
//각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 
//문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

import java.util.Scanner;

public class Baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
