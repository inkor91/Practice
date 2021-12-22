package codeup;

import java.util.Scanner;

// 1163 : 당신의 사주를 봐 드립니다 2
// 세 정수가 입력으로 주어진다. 순서대로 년도, 월, 일 이다.
// 년도 + 월 + 일의 100의 자리가 숫자가 짝수이면 "대박"을 , 그렇지 않으면 "그럭저럭"을 출력하시오.
public class codeup1163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int sum = year+month+day;
		
		if(sum/100%10%2==0) {
			System.out.println("대박");
		}else {
			System.out.println("그럭저럭");
		}
	}
}
