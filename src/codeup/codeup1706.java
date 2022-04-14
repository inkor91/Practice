package codeup;

import java.util.Scanner;

// 1706 : 5개의 데이터
// 5개의 숫자를 입력받는다.
// 입력되는 숫자는 100 미만의 자연수이다.
// 입력받은 수를 역순으로 출력한다.

public class codeup1706 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 4; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
