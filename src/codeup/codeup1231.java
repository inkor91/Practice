package codeup;

import java.util.Scanner;

// 1231 : 계산기 1
// 연산식이 한줄로 입력된다.
// 연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.
// 계산 결과를 정수로 출력한다.
// 나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
// (0으로 나누는 경우는 입력되지 않는다.)

public class codeup1231 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cal = sc.next();
		if(cal.contains("+")) {
			String[] cal2 = cal.split("\\+");
			System.out.println(Integer.parseInt(cal2[0])+Integer.parseInt(cal2[1]));
		}else if(cal.contains("-")) {
			String[] cal2 = cal.split("\\-");
			System.out.println(Integer.parseInt(cal2[0])-Integer.parseInt(cal2[1]));
		}else if(cal.contains("*")) {
			String[] cal2 = cal.split("\\*");
			System.out.println(Integer.parseInt(cal2[0])*Integer.parseInt(cal2[1]));
		}else if(cal.contains("/")) {
			String[] cal2 = cal.split("\\/");
			System.out.println(String.format("%.2f",(double)Integer.parseInt(cal2[0])/Integer.parseInt(cal2[1])));
		}
	}
}
