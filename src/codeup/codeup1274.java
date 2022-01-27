package codeup;

import java.util.Scanner;

// 1274 : 소수 판별
// 2이상의 자연수가 입력으로 주어진다.
// 입력으로 주어진 수가 소수이면 "prime"을 출력, 소수가 아니면 "not prime"을 출력한다.
public class codeup1274 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for (int i = 1; i <=n; i++) {
			if(n%i ==0) {
				a = a + 1;
			}
		}
		if(a==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
}
