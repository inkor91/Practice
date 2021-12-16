package codeup;

import java.util.Scanner;

// 1136 : 관계연산자 2
// 두 정수 a, b가 공백을 두고 입력된다.(a,b는 int형 범위)
// a와 b가 같을 경우 1, 그렇지 않은 경우 0을 출력한다.
public class codeup1136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
				
	}
}
