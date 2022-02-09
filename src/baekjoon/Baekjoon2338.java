package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성
// 첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.

public class Baekjoon2338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		BigInteger a = sc.nextBigInteger(); 
		BigInteger b = sc.nextBigInteger(); 
		
		System.out.println(a.add(b)); 
		System.out.println(a.subtract(b)); 
		System.out.print(a.multiply(b));

	}
}
