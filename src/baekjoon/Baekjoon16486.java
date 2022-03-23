package baekjoon;

import java.util.Scanner;

// 운동장 한 바퀴
// 위의 그림에서 영역 A와 B는 반원이며, 영역 C는 직사각형이다. 
// 영역 C의 가로의 길이를 d1, 영역 A의 반지름의 길이 d2의 값이 주어지면 운동장의 한 바퀴 둘레를 알아내는 프로그램을 작성하시오. (
// 첫째 줄에 d1의 값이 주어진다. 둘째 줄에는 d2의 값이 주어진다. (d1, d2의 값은 100,000 이하의 양의 정수)
// 첫째 줄에 문제에서 요구하는 정답을 출력한다. 절대/상대 오차는 10-6 까지 허용한다.

public class Baekjoon16486 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		double result = (2*d1) + (2*d2*Math.floor(Math.PI*1000000)/1000000.0);
		
		System.out.println(result);
	}
}
