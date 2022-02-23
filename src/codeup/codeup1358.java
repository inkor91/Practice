package codeup;

import java.util.Scanner;

// 1358 : 삼각형 출력하기 5
// 어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
// 여기서 입력되는 n은 반드시 홀수이다.
// 3부터 99 까지의 홀수 중 하나가 입력된다.
// Sample Output 같은 삼각형을 출력한다.

public class codeup1358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i+=2) {
			for (int j = n-1; j > i; j-=2) {
				System.out.print(" ");
			}
			for (int j = n-i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
