package codeup;

import java.util.Scanner;

// 1362 : 숫자 피라미드 3
// 길이 n이 입력된다.(1<=n<=99)
// 숫자 피라미드를 출력한다.(출력되는 숫자 사이는 빈 칸으로 띄운다.)

public class codeup1362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <=n; i++) {
			count+=i;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println(" ");
		}
	}
}
