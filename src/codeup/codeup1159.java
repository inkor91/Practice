package codeup;

import java.util.Scanner;

//1159 : 특별한 공 던지기 3
// 슬기가 던진 공의 위치가 입력된다.(정수)

//1. 공의 위치가 50m~70m이면 슬기가 이김.또는
//2. 공의 위치가 6의 배수이면 슬기가 이김. 
//슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.

public class codeup1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=50&&a<=70 || a%6==0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}
