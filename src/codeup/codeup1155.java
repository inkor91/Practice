package codeup;

import java.util.Scanner;

// 1155 : 7의 배수
// 자연수가 입력된다.
// 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
public class codeup1155 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%7==0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
	}
}
