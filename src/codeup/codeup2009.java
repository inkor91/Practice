package codeup;

import java.util.Scanner;

// 현재 영일이가 가진 쿠폰 개수(K)와 카페에서 요구하는 필요 쿠폰 개수(N)이 공백으로 구분되어 입력된다.
// 영일이가 먹을 수 있는 최대 아메리카노 개수를 출력한다.

public class codeup2009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coupone = Integer.parseInt(sc.next());
		int count = Integer.parseInt(sc.next());
	
		int coffee = 0;
		while (coupone >= count) {
			int share = 0;
			coffee += coupone/count;
			share = coupone/count;
			coupone = coupone%count+share;
		}
		
		System.out.println(coffee);
		}
}
