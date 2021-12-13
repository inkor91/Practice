package codeup;

import java.util.Scanner;

// 1123 : 섭씨 온도를 화씨 온도로 변환

// 섭씨 온도가 입력되면 화씨 온도로 변환하시오.
// 화씨 온도 = 9 / 5 * 섭씨온도 + 32
public class codeup1123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float f = (float)9/5 * c +32;
		System.out.printf("%.3f",f);
		
	}
}
