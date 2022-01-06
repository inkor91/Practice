package codeup;

import java.util.Scanner;

// 1228 : 비만도 측정 1
// 

public class codeup1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double avg = (height - 100) * 0.9;
		double bmi = (weight-avg)*100/avg;
		
		if(bmi<=10) {
			System.out.println("정상");
		}else if(bmi>20) {
			System.out.println("비만");
		}else {
			System.out.println("과체중");
		}
	}
}
