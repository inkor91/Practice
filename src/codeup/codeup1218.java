package codeup;

import java.util.Scanner;

//1218 : 삼각형 판단하기
// 변의 길이 a, b, c가 입력된다. ( 정수)
// 조건에 따라 삼각형을 출력한다.
//조건)
// 세 변의 길이가 같은 경우 : 정삼각형
// 두 변의 길이가 같은 경우 : 이등변삼각형
// a2 + b2 = c2일 경우(피타고라스 정리) : 직각삼각형
// 위의 조건에 맞지 않는 일반 삼각형일 경우 : 삼각형
// 삼각형이 아닐 경우 : 삼각형아님을 출력한다.

public class codeup1218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b<=c) {
			System.out.println("삼각형아님");
		}else if(a==b&&b==c){
			System.out.println("정삼각형");
		}else if(a==b || b== c || c== a) {
			System.out.println("이등변삼각형");
		}else if(a*a + b*b == c*c) {
			System.out.println("직각삼각형");
		}else {
			System.out.println("삼각형");
		}
		
	}
	
}
