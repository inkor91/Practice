package codeup;

import java.util.Scanner;

// 1253 : a 부터 b까지 출력하기
// 두 수 a, b가 입력으로 들어온다. ( a, b는 정수, a, b 중 어떤 수가 큰지 모름)
// a와 b 사이의 정수들을 오름차순으로 출력한다.

public class codeup1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int start = 0;
		int end = 0;
		
		if(a >=b ) {
			start =b;
			end = a;
		}else {
			start = a;
			end = b;
		}
		
		for (int i = start; i <=end; i++) {
			System.out.print(i+" ");
		}
	}
}
