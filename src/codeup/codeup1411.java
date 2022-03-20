package codeup;

import java.util.Arrays;
import java.util.Scanner;

// 1411 : 빠진 카드
// 첫 줄에는 한 장을 잃어버리기 전 카드의 전체 장수 N이 주어져 있다. 단 . 3 <= N <= 50 이다.
// 이어지는 N-1개의 각 줄에는 한 장이 빠진 카드 묶음의 카드 숫자가 하나씩 순서 없이 나열되어 있다.

public class codeup1411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] card = new int[50];
		for (int i = 0; i < n-1; i++) {
			card[i] = sc.nextInt();
		}
		
		Arrays.sort(card, 0, n-1);
		for (int i = 0; i < n; i++) {
			if(card[i] !=  i+1 || card[i] == 0) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
