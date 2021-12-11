package codeup;

import java.util.Scanner;

// 1118 : 삼각형의 넓이 구하기
// 삼각형의 넓이를 구하는 프로그램을 작성한다.
// 삼각형의 넓이 = 밑변 * 높이 / 2
// 삼각형의 넓이를 소수 첫째자리까지 출력한다.

public class codeup1118 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		float area = width * height / 2.0F;
		System.out.println(String.format("%.1f", area));
	}
}
