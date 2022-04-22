package baekjoon;

import java.util.Scanner;

// 1436 영화감독 숌
// 첫째 줄에 숫자 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
// 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.

public class Baekjoon1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while (count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
