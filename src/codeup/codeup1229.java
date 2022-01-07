package codeup;

import java.util.Scanner;

// 1229 : 비만도 측정 2
// 키와 몸무게를 이용하여 비만도를 측정할 수 있다.
// 아래와 같이 표준 몸무게와 비만도 계산법이 있을 때, 비만도를 측정하는 프로그램을 작성하시오.

public class codeup1229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double avg;
		double bmi;
		
		if(height<150) {
			avg = (height-100);
		}else if(height>=160) {
			avg = (height - 100) * 0.9;
		}else {
			avg = (height - 150)/2 +50;
		}
			
		bmi = (weight-avg)*100/avg;
		
		if(bmi<=10) {
			System.out.println("정상");
		}else if(bmi>20) {
			System.out.println("비만");
		}else {
			System.out.println("과체중");
		}
	}
}
