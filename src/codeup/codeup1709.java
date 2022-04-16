package codeup;

import java.util.Arrays;
import java.util.Scanner;

// 1709 : 내림차순 정렬
//   첫줄에는 데이터의 개수를 입력받는다.(100이하의 정수)
// 다음 줄에는 데이터가 입력된다.(100이하의 정수)
// 정렬된 데이터가 출력된다.

public class codeup1709 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = Integer.parseInt(sc.nextLine());
		int [] numbers = new int[data];
		for (int i = 0; i < data; i++) {
			numbers[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(numbers);
		
		for (int i = data-1; i >= 0 ; i--) {
			System.out.print(numbers[i]+" ");
		}
	}
}
