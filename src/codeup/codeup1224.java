package codeup;

import java.util.Scanner;

// 1224 : 분수 크기 비교
// a , b , c , d 가 차례대로 입력으로 주어진다.(자연수)
// a / b  >  c / d  이면  > 를 출력,
// a / b =  c / d  이면  = 를 출력,
// a / b  <  c / d  이면 < 를 출력.


public class codeup1224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		if((a/b)>(c/d)) {
			System.out.println(">");
		}else if((a/b)<(c/d)) {
			System.out.println("<");
		}else if((a/b)==(c/d)){
			System.out.println("=");
		}
	}
}
