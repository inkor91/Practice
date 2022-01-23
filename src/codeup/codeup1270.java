package codeup;

import java.util.Scanner;

// 1270 : 1의 개수는? 1 
// n이 입력된다. ( 1 <= n <= 1,000,000 )
// 맨 마지막 자리에 1이 몇 번 들어 있는지 출력한다.

public class codeup1270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		
		for (int i = 0; i <= n; i++) {
			if(i%10==1) {
				a++;
			}
		}
		System.out.println(a);
	}
}
