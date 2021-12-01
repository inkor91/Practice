package codeup;

import java.util.Scanner;

//1088 : [기초-종합] 3의 배수는 통과?

//1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
//3의 배수인 경우는 출력하지 않도록 만들어보자.

//예를 들면,
// 1 2 4 5 7 8 10 11 13 14 ...
// 와 같이 출력.


public class codeup1088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			if(i%3==0){ // 3의 배수일 경우
				System.out.print("");				
			}else { // 3의 배수가 아닐 경우
				System.out.print(i+" ");
			}
		} // end for
		
	} // end main()
} // end class
