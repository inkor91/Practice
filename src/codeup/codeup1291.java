package codeup;

import java.util.Scanner;

// 1291 : 바이러스 백신
// 최근 무서운 감기 바이러스들이 유행처럼 번지고 있다.
// 최근 유행인 바이러스는 모두 3가지 종류로 각 바이러스들은 모두 3000이하의 자연수로 표현된다.
// 여러분은 3가지 바이러스 감염을 예방할 수 있는 백신을 개발해야 한다.
// 백신도 3000 이하의 자연수로 표현되며, 만약 바이러스의 값이 백신의 값으로 나누어 떨어지면 백신으로 바이러스 감염을 예방할 수 있다.
// 백신의 개발비는 백신의 숫자 값이 작을수록 비싸다.
// 즉 백신 3과 백신 2가 있다면 백신 3의 가격이 더 저렴하므로 개발하는데 이득이다.
// 3가지 바이러스 감염을 예방할 수 있는 가장 싼 백신을 개발하는 프로그램을 작성하시오.

public class codeup1291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		
		int c = 0;
		for (int i = 1; i <= v1; i++) {
			if(v1%i==0 && v2%i==0 && v3%i==0) {
				c=i;
			}
		}
		
		System.out.println(c);
	}
}
