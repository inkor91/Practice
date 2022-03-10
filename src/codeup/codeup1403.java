package codeup;

import java.util.Scanner;

// 1403 : 배열 두번 출력하기
// 첫 줄에 k가 입력된다.(k<=100)
// 둘째 줄에 k개의 정수들이 공백으로 구분되어 입력된다.
// k개의 숫자를 입력받은 순서대로 한 줄에 하나씩 출력한다. 그리고 한번 출력이 다 되면 다시 한번더 출력한다.(총 2번)

public class codeup1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
	}
}
