package codeup;

import java.util.Scanner;

// 1173 : 30분전 

// 시와 분이 입력된다.
// ( 시의 범위 : 0~ 23)
// (분의 범위 : 0~ 59)

// 입력된 시간의 30분 전의 시간을 출력

public class codeup1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (hour <= 24 && min >= 30) {
			System.out.printf("%d %d ", hour, min - 30);
		} else if (hour <= 0 && min <= 30) {
			System.out.printf("%d %d ", hour + 23, min + 30);
		} else if (hour <= 24 && min <= 30) {
			System.out.printf("%d %d ", hour - 1, min + 30);
		}

	}
}

