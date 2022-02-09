package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// 엄청난 부자2
// 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다
// 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.

public class Baekjoon1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger m = sc.nextBigInteger();
		BigInteger r = sc.nextBigInteger();
		
		System.out.println(m.divide(r));
		System.out.println(m.remainder(r));
	}
}
