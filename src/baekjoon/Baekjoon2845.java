package baekjoon;

import java.util.Scanner;

// 파티가 끝나고 난 뒤 
// 첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
// 둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 106보다 작은 양의 정수 5개가 주어진다.
// 출력은 첫째 줄에 다섯 개의 숫자를 출력해야 한다. 이 숫자는 상근이가 계산한 참가자의 수와  각 기사에 적혀있는 참가자의 수의 차이이다.

public class Baekjoon2845 {
	public static void main(String[] args) {
		
		int b[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int p = a1*a2;
		int r1 = b[0]-p;
		int r2 = b[1]-p;
		int r3 = b[2]-p;
		int r4 = b[3]-p;
		int r5 = b[4]-p;
		
		System.out.print(r1+" "+r2+" "+r3+" "+r4+" "+r5);
			
	}
}
