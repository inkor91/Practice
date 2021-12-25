package codeup;

import java.util.Scanner;

//1171 : 당신의 학번은? 2
// 학년, 반, 번호가 공백을 기준으로 입력으로 주어진다. (정수)
// 입력범위:
// 학년 : 3이하 , 반, 20이하, 번호, 999이하
// 위의 예를 보고 학번이 총6자리가 되게 출력하시오. 빈 부분은 0으로 채운다.

public class codeup1171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int group = sc.nextInt();
		int number = sc.nextInt();
		
		if(grade >3 || grade > 20 || number > 999) {
			System.out.println("입력범위 초과");
		} else {
			System.out.printf("%d%02d%03d", grade,group,number);
		}
	}
}
