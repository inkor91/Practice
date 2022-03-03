package codeup;

import java.util.Iterator;
import java.util.Scanner;

// 1368 : 평행사변형 출력하기 2
// 이번엔 공백의 방향까지 정하여 평행사변형을 만들자.
//방향 정보는 다음과 같다.
//L=왼쪽 아래에 공백
//R=오른쪽 아래에 공백
//다음 조건에 맞춰 평행사변형을 출력한다.

public class codeup1368 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int k = sc.nextInt();
		String d = sc.next();
		
		for (int i = 0; i < h; i++) {
			if(d.equals("L")) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
			}else {
				for (int j = i; j < h-1; j++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
