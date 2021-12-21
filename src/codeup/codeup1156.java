package codeup;

import java.util.Scanner;

// 1156 : 홀수 짝수 구별
// 자연수 하나가 입력된다.
// 홀수이면 odd를 출력, 짝수이면 even을 출력하시오.
public class codeup1156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
