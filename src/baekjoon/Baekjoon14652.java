package baekjoon;

import java.util.Scanner;

// 나는 행복합니다~
// 첫째 줄에 관중석의 크기를 나타내는 N, M과 잃어버린 관중석 번호를 나타내는 K가 주어진다
// 욱제의 잃어버린 자리를 찾아서, 잃어버린 자리의 좌표 (n, m)를 하나의 공백을 사이에 두고 숫자만 출력

public class Baekjoon14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int seat = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(seat==count) {
					System.out.println(i+" "+j);
				}
				count++;
			}
		}
	}
}
