package codeup;

import java.util.Scanner;

// 1753 : 코드 네임
// 첫째줄에 n명이 입력된다.  (1<=n<=100)
// 2번째줄부터 n명의 영어이름이 입력된다.(영어이름은 알파벳 소문자만 입력되고, 최대길이 100글자이내)
// 각줄에 걸쳐 n명의 코드 네임을 출력하시오.

public class codeup1753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleNum = Integer.parseInt(sc.nextLine());
		String line;
		
		for (int i = 0; i < peopleNum; i++) {
			line = sc.nextLine();
			for (int j = line.length()-1; j>= 0; j--) {
				System.out.print(line.charAt(j));
			}
			System.out.println();
		}
	}
}
