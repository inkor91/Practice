package codeup;

import java.util.Scanner;

// 1610 : 서브 스트링
// 첫째 줄에 문자열이 공백없이 입력된다.(문자열은 100글자 이하)
// 둘째 줄에 문자열의 시작위치와 글자 개수가 입력된다.
// (첫글자는 시작위치가 0이다. 글자개수는 시작위치부터 출력할 글자 수를 의미한다.)

public class codeup1610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println(word.substring(start,start+end));
	}
}
