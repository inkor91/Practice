package codeup;

import java.util.Scanner;

// 1170 : 당신의 학번은? 1
// 학년, 반, 번호가 공백을 기준으로 입력으로 주어진다. (정수)
// 입력범위:
// 학년 : 3이하 , 반, 6이하, 번호, 30이하

public class codeup1170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int group = sc.nextInt();
		int number = sc.nextInt();
		
		if(grade >3 || grade > 6 || number > 30) {
			System.out.println("입력범위 초과");
		} else {
			System.out.printf("%d%d%02d", grade,group,number);
		}
	}
}
