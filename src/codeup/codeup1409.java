package codeup;

import java.util.Scanner;

// 1409 : 기억력 테스트 1
// 첫째 줄에 숫자 10개가 차례대로 입력된다.
// 둘째 줄에 k값이 입력된다. 

public class codeup1409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		System.out.println(num[k-1]);
	}
}
