package codeup;

import java.util.Scanner;

// 1168 : 나이 계산 1
// 생년월일(6자리)과 성별정보(1자리)가 공백으로 분리되어 정수로 주어진다.
// 2012년도을 기준으로 현재 나이를 출력하시오.

public class codeup1168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int frontNo = sc.nextInt();
		int backNo = sc.nextInt();
		
		int now = 2012;
		int age = 0;
		
		if(backNo==1 || backNo==2) {
			frontNo = frontNo/10000+1900; // 몫에서 해당 년대를 더한다
		} else {
			frontNo = frontNo/10000+2000;
		}
		
		age = now - frontNo+1;
		System.out.println(age);
			
	}
}
