package codeup;

import java.util.Scanner;

// 1125 : 8진수 16진수 변환
// 10진수 정수를 입력받아 8진수와 16진수로 출력한다.

public class codeup1125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String o = Integer.toOctalString(num); // 8진수 변환
		String h = Integer.toHexString(num).toUpperCase(); // 16진수 및 대문자 변환
		
		System.out.println(o + " " + h );
	}
}
