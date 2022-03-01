package baekjoon;

import java.util.Scanner;

// 과자
// 첫 번째 줄에는 과자 한 개의 가격 K, 사려고 하는 과자의 개수 N, 현재 동수가 가진 돈 M이 각각 공백을 사이에 두고 주어진다. 
// 단, K, N은 1,000 이하의 양의 정수이고, M은 10만 이하의 양의 정수이다. 
// 첫 줄에 동수가 부모님께 받아야 하는 돈의 액수를 출력한다. 

public class Baekjoon10156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); // 과자 한 개 가격
		int N = sc.nextInt();  // 사려고 하는 과자의 개수
		int M = sc.nextInt();  // 현재 동수가 가진 돈
		
		int price = K * N - M;
		
		System.out.println(price>0?price:0);
	}
}
