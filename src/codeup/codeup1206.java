package codeup;

import java.util.Scanner;

// 1206 : 배수
// 자연수 두 개가 입력된다.
// 두 자연수 a, b가 주어진다.
// b가 a의 배수이면 "a*x=b"를 출력하고,
// a가 b의 배수이면 "b*x=a"를 출력하고,
// 배수관계가 아니면 "none"을 출력하시오.
// 위의 문제 설명을 보고 배수 관계를 출력한다.

public class codeup1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b%a==0) {
			System.out.println(a+"*"+(b/a)+"="+b);
		}else if(a%b==0) {
			System.out.println(b+"*"+(a/b)+"="+a);
		}else {
			System.out.println("none");
		}
	}
}
