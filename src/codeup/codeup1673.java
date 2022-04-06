package codeup;

import java.util.Scanner;

// 1673 : 만능 디지털 카드키 만들기
// 1) 세 자연수가 입력된다.
// 2) 각 값들은 도어락의 내부 보안키값을 의미한다.
// 3) 각 값은 1,000이하의 자연수이다.
// 가장 가격이 저렴한 만능보안키의 ID값을 출력한다.

public class codeup1673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lock1 = sc.nextInt();
		int lock2 = sc.nextInt();
		int lock3 = sc.nextInt();
		
		for (int i = lock1; i > 0; i--) {
			if(lock1%i==0 && lock2%i==0 && lock3%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
