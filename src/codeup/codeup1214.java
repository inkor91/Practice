package codeup;

import java.util.Scanner;

// 1214 : 이 달은 며칠까지 있을까?
// 연도와 월이 입력된다.
// 그 달의 마지막 날이 며칠인지 출력한다.
// - 조건 1 : 400의 배수인 해는 모두 윤년이다.
//  조건 2 : 4의 배수인 해들 중 100의 배수가 아닌 해들은 모두 윤년이다.

public class codeup1214 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		
		if(m==2) {
			if(((y%4==0)&&(y%100!=0)) || y%400==0)
				System.out.println("29");
			else
				System.out.println("28");
		}
		else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
			System.out.println("31");
		else
			System.out.println("30");
	}
}
