package codeup;

import java.util.Scanner;

// 1380 : 두 주사위의 합
// 두 주사위를 굴려 나오는 합 k 가 입력된다. 
// 합이 k가 되는 두 주사위의 눈이 출력된다. 
// 첫 번째 출력되는 수는 첫번째 주사위의 눈이고, 두 번째 출력되는 수는 두번째 주사위의 눈이다.
// 출력은 첫번째 주사위의 눈이 작은 수에서 큰 순서로 출력한다.

public class codeup1380 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if(i<7&&n-i<7) {
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n-i);
				System.out.println();
			}
		}
	}
}
