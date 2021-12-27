package codeup;

import java.util.Scanner;

// 1202 : 등급 판정
// 점수가 정수로 입력된다. (입력되는 정수는 0~100이다)
// 점수에 따라 등급을 출력한다.
public class codeup1202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");			
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
