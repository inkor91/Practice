package codeup;

import java.util.Scanner;

//1265 : 구구단 출력하기 1
//입력으로 원하는 단이 입력된다( 단: 1~9)
//출력양식에 맞추어 출력한다.

public class codeup1265 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
}
