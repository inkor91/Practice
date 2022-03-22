package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// A/B - 3 
// 두 정수 A와 B를 입력받은 다음, A/B의 몫과 나머지를 출력하는 프로그램을 작성하시오.
// 어떤 정수 q와 r에 대해 A = qB + r (0 ≤ r < |B|)로 나타낼 수 있을 때, q를 몫, r을 나머지라고 한다.
// 첫째 줄에 A/B의 몫, 둘째 줄에 나머지를 출력한다.

public class Baekjoon16428 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		if(a.compareTo(BigInteger.ZERO) ==-1 && b.compareTo(BigInteger.ZERO)==-1) {
			System.out.println((a.divide(b)).add(BigInteger.ONE));
			System.out.println((a.remainder(b)).subtract(b));
		}else if(a.compareTo(BigInteger.ZERO) ==-1 && b.compareTo(BigInteger.ZERO)== 1) {
			System.out.println((a.divide(b)).subtract(BigInteger.ONE));
			System.out.println((a.remainder(b)).add(b));
		}else {
			System.out.println(a.divide(b));
			System.out.println(a.remainder(b));
		}
		
	}
}
