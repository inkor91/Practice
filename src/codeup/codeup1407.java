package codeup;

import java.util.Scanner;

// 1407 : 문자열 출력하기 1
// 길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.

public class codeup1407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = str.replace(" ", "");
		System.out.println(result);
	}
}
