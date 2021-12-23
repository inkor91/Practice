package codeup;

import java.util.Scanner;

// 1164 : 터널 통과하기 1
// 터널의 높이가 차례대로 3개 주어진다. (정수)
// 170보다 같거나 작으면 "CRASH"를 출력, 그 보다 크면 "PASS"를 출력하시오.
public class codeup1164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=170||b<=170||c<=170) {
			System.out.println("CRASH");
		}else {
			System.out.println("PASS");
		}
	}
}
