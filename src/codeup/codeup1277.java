package codeup;

import java.util.Scanner;

// 1277 : 몇 번째 데이터 출력하기
// 입력으로 N이 주어지고 그 다음줄에 N개의 데이터가 공백으로 구분되어 입력된다.(단, N>=1인 홀수)
// 첫번째, 중간, 마지막 데이터 값을 출력한다.

public class codeup1277 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(a[0]+" "+a[n/2]+" "+a[n-1]);
	}
}
