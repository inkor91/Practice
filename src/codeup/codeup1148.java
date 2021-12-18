package codeup;

import java.util.Scanner;

// 1148 : 비트 연산자(>>)
// 두 정수 a, x입력.(1<=a<=100,000 , 1<=x<=10)
// a를 x번 SHIFT(>>) 연산한 후 결과를 10진수로 출력한다.
public class codeup1148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d", a>>b);
	}
}
