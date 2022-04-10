package codeup;

import java.util.Scanner;

// 1677 : 종이 자르기 
// 가로 길이 n과 세로 길이 m이 공백으로 분리되어 입력된다.(2 <= n, m <= 50)
// n*m 크기의 종이를 출력한다.
// 가로는 '-', 세로는 '|'로 출력하며, 가로와 세로가 겹치는 부분은 '+'로 출력한다.

public class codeup1677 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if((i == 0 || i == height-1) && (j==0 || j == width-1)){
					System.out.print("+");
				}else if(i==0||i==height-1) {
					System.out.print("-");
				}else if(j==0 || j==width-1) {
					System.out.print("|");
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
