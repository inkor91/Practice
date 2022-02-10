package codeup;

import java.util.Scanner;

// 1289 : 가장 큰 운동장
// 가로와 세로의 정수 길이를 3세트 입력 받는다. 
//  넓이가 가장 넓은 운동장의 넓이를 출력한다.

public class codeup1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int biggest = 0;
		
		int w1 = sc.nextInt();
		int h1 = sc.nextInt();
		int w2 = sc.nextInt();
		int h2 = sc.nextInt();
		int w3 = sc.nextInt();
		int h3 = sc.nextInt();
		
		int ground1= w1*h1;
		int ground2= w2*h2;
		int ground3= w3*h3;
		
		if(ground1>ground2&&ground1>ground3) {
			biggest = ground1;
		}else if(ground2>ground3&&ground2>ground1) {
			biggest = ground2;
		}else {
			biggest = ground3;
		}
		System.out.println(biggest);
		
	}
}
