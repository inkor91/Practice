package codeup;

import java.util.Scanner;

//  1212 : 삼각형의 성립 조건
// 직선의 길이 3개가 입력으로 주어진다.(정수)
// 삼각형의 성립 조건)
// a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
// c < a + b 이면 삼각형이 성립됨.

public class codeup1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int a=0, b=0, c=0;
		if(n1>=n2 && n1>=n3) {
			c = n1;
			a = n2;
			b = n3;
		}else if(n2>=n1 && n2>=n3) {
			c = n2;
			a = n1;
			b = n3;
		}else if(n3>=n1 && n3>=n2) {
			c = n3;
			a = n1;
			b = n2;
		}
		
		if(c<a+b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
