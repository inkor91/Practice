package codeup;

import java.util.Scanner;

// 1158 : 특별한 공 던지기 2
// 공의 위치 n이 정수로 입력됨.(이번에는 정수로 입력됨)
// 공이 떨어지는 위치 n이 30≤n≤40 이거나 60≤n≤70 이면, win을 출력, 그외에는 lose를 출력한다.

public class codeup1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=30&&a<=40 || a>=60&&a<=70) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}
