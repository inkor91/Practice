package baekjoon;

import java.util.Scanner;

// 조별과제를 하려는데 조장이 사라졌다
// 3학년 1학기를 재학 중인 성우는 ‘빨간눈 초파리의 뒷다리 털의 개수와 파인애플 껍질의 이해’라는 과목을 수강 중이다. 
// 하지만 성우의 조 조장인 민건은 과제 내용을 듣자마자 집으로 도망쳐 버렸고, 
// 성우는 민건이를 찾기 위해 떠난다. 성우는 1분에 1에서 5까지의 거리를 이동할 수 있다. 
// 성우가 있는 곳으로부터 민건이의 집까지 거리가 주어졌을 때, 최대한 빨리 찾을 경우, 정확히 몇 분만에 민건이를 찾을 수 있는지 출력하는 프로그램을 작성하시오.

// 첫째 줄에 성우의 현재 위치와 민건이의 집까지의 거리 L(1 ≤ L ≤ 1,000,000)가 주어진다.
// 성우가 최소 t분만에 민건이를 찾을 수 있을 때, t 이상의 가장 작은 정수를 출력한다.

public class Baekjoon15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		
		int t = d/5;
		int r = d%5;
		
		if(r > 0) {
			System.out.println(t +1);
		}else {
			System.out.println(t);
		}
	}
}
