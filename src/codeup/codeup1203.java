package codeup;

import java.util.Scanner;

// 1203 : 비만도 측정 0
// BMI수치가 정수로 입력된다.
// BMI수치에 따라 비만인지 판정
public class codeup1203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bmi = sc.nextInt();
		if(bmi<=10) {
			System.out.println("정상");
		}else if(bmi>20) {
			System.out.println("비만");
		}else {
			System.out.println("과체중");
		}
	}
}
