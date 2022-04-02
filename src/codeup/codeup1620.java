package codeup;

import java.util.Scanner;

// 1620 : 자릿수의 합
// 자연수 n이 입력된다. (1 <= n <= 10,000,000)
// 자릿수의 합이 한자리가 될때까지 계산하여 출력한다.

public class codeup1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		while(number.length()>1) {
			int result = 0;
			for(int i=0; i<number.length(); i++) {
				result += number.charAt(i)-48;
			}
			
			number = String.valueOf(result);
		}
		
		System.out.println(number);
	}
}
