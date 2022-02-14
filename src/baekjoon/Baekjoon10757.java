package baekjoon;

import java.util.Scanner;
import java.math.BigInteger;

// 큰 수 A+B
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다, 첫째 줄에 A+B를 출력
 
public class Baekjoon10757 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}
}