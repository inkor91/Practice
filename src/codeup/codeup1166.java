package codeup;

import java.util.Scanner;

// 1166 : 윤년 판별
// 해(year)가 입력된다.
// 윤년이면 "yes"를 출력, 윤년이 아니면 "no"를 출력하시오.
public class codeup1166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
