package codeup;

import java.util.Scanner;

// 1366 : 사각형 출력하기 4
// 사각형의 크기 n이 입력된다.(n은 홀수)
// 대각선과 테두리가 그려진 사각형에 가로, 세로 중심에 선을 추가한 사각형을 출력한다.

public class codeup1366 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("*");//첫째줄별
		}
		System.out.println();
		for (int i = 1; i < n-1; i++) {// n회반복
			for (int j = 0; j < n; j++) {//가로 n번반복  
		//j==0 왼쪽테두리 별) j==i 왼쪽시작 대각선별) j==n-1-i 오른쪽시작 대각선별) j==n-1 오른쪽테두리별
				if(j==0 || j==i || j==n-1-i || j==n-1||n/2 == i||n/2 == j) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) { //마지막줄 별
			System.out.print("*");
		}
	}
}
