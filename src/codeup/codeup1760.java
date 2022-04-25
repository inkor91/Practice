package codeup;

import java.util.Scanner;

// 1760 : 비밀 전화번호 
// 첫 번째 줄에 코드표의 문자 10개가 주어진다. (순서대로 0~9이다. 알파벳 소문자만 입력됨. 중복x)
// 두번째 줄에 암호화된 전화번호 3블럭이 띄워쓰기로 구분되어 입력된다.
// 암호를 풀은 전화번호를 출력한다. 

public class codeup1760 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Line = sc.nextLine();
		String phoneNum = sc.nextLine();
		
		char[] numbers = new char[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Line.charAt(i);
		}
		
		for (int i = 0; i < phoneNum.length(); i++) {
			if (phoneNum.charAt(i) == ' ') System.out.print(' ');
			if (phoneNum.charAt(i) == numbers[0]) System.out.print('0');
			if (phoneNum.charAt(i) == numbers[1]) System.out.print('1');
			if (phoneNum.charAt(i) == numbers[2]) System.out.print('2');
			if (phoneNum.charAt(i) == numbers[3]) System.out.print('3');
			if (phoneNum.charAt(i) == numbers[4]) System.out.print('4');
			if (phoneNum.charAt(i) == numbers[5]) System.out.print('5');
			if (phoneNum.charAt(i) == numbers[6]) System.out.print('6');
			if (phoneNum.charAt(i) == numbers[7]) System.out.print('7');
			if (phoneNum.charAt(i) == numbers[8]) System.out.print('8');
			if (phoneNum.charAt(i) == numbers[9]) System.out.print('9');
		}
	}
}
