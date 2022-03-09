package codeup;

import java.util.Scanner;

// 1402 : 거꾸로 출력하기 3
// 첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
// 둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.
// n개의 데이터를 입력의 역순으로 출력

public class codeup1402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = n-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
