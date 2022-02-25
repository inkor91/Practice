package codeup;

import java.util.Scanner;

// 1360 : 숫자 피라미드 2
// 길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.
//예) n이 5이면
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1 

public class codeup1360 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
	}
}
