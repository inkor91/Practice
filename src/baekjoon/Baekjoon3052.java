package baekjoon;

import java.util.Scanner;

// 나머지 
// 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
// 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

public class Baekjoon3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int[] number = new int[1000];
		
		int a = 42;
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			num[i] = n % a;
		}
		
		for (int i = 0; i < num.length; i++) {
			number[num[i]]++;
		}
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
