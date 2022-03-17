package baekjoon;

import java.util.Scanner;

// 이칙연산 
// 다음과 같이 세 수가 연속해서 주어졌을 때 
//한 번의 곱셈 기호와 한 번의 나눗셈 기호를 이용하여 만든 식 중 
//가장 큰 값을 출력하는 프로그램을 작성하시오. (세 수의 순서는 변하지 않는다.)

// 나올 수 있는 가장 큰 값을 출력한다. 
//단, 소수점 아래는 버린다. 1e-9 이하의 오차로 인해 출력이 달라지는 입력은 주어지지 않는다.

public class Baekjoon15726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		int c1 = (int)((a * b) / c);
        int c2 = (int)((a / b) * c);
        if (c1 > c2)
            System.out.println(c1);
        else
            System.out.println(c2);
    }
}
