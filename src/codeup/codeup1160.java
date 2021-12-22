package codeup;

import java.util.Scanner;

// 1160 : 아르바이트 가는 날
// 입력으로 요일의 번호가 하나 주어진다.(정수)
//  아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
public class codeup1160 {
	public static void main(String[] args) {
		int mon = 1;
		int tue = 2;
		int wed = 3;
		int thur = 4;
		int fri = 5;
		int sat = 6;
		int sun = 7;
		
		Scanner sc = new Scanner(System.in);
		int work = sc.nextInt();
		
		if(work==1||work==3||work==5||work==7) {
			System.out.println("oh my god");
		}else {
			System.out.println("enjoy");
		}
		
	}
}
