package codeup;

import java.util.Scanner;

// 1157 : 특별한 공 던지기 1
// 슬기가 던진 공의 위치가 입력으로 주어진다.(실수)
// 50이상 60이하이면 win을 출력, 그 외에는 lose를 출력하시오.

public class codeup1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		if(a>=50&&a<=60) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}
