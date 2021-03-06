package baekjoon;

import java.util.Scanner;

// 폰 노이만과 파리
// 이 문제를 푸는 “간단한 논리”는 다음과 같다.  두 기차는 200/(50*2) = 2 시간 후에 만난다.  
// 파리는 2시간동안 시간당 75마일의 속도로 이동하므로 2*75 = 150 마일을 이동한다.
// 우리는 위에서 제시한 문제를 풀 수 있는 프로그램을 만들고 싶다. 
// 하지만 우리의 컴퓨터는 안타깝게도 폰 노이만의 두뇌보다 성능이 좋지 못하기 때문에 무한급수를 이용하여 프로그램을 만들 수는 없다.  
// 위에서 말한 “간단한 논리”를 이용하여 기차의 속도 S,  파리의 속도 T, 그리고 처음 두 기차 사이의 거리 D가 주어졌을 때 
//두 기차가 만날 때까지 파리의 이동거리 F를 계산하는 프로그램을 작성하라.

public class Baekjoon14924 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int S = sc.nextInt();
	int T = sc.nextInt();
	int D = sc.nextInt();
	int F = (D/(S*2))*T;
	System.out.println(F);
	}
}
