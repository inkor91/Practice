package codeup;

import java.util.Scanner;

// 1296 : 직사각형의 최대 넓이
/// 길이가 n인 철망을 이용하여 직사각형 모양의 가축 우리를 가능한 한 넓게 만들려고 한다.
// 이 때 최대 넓이를 정수로 출력하시오.
// 철망의 길이 n이 입력된다.
// 가축 우리의 최대 넓이를  정수로 출력한다.(소수점 이하는 버린다.)

public class codeup1296 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double l = n/4.0;
		int w = (int)(l*l);
		System.out.println(w);
	}
}
