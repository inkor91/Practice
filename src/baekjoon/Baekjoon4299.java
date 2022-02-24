package baekjoon;

import java.util.Scanner;

// AFC 윔블던
// 첫째 줄에 두 팀 점수의 합과 차가 빈 칸으로 구분되어 주어진다. 축구 점수는 항상 음이 아닌 정수이고, 
// 합과 차는 1000보다 작거나 같은 음이 아닌 정수이다.
// 첫째 줄에 두 팀의 경기 결과를 출력한다. 득점을 많이 한 쪽을 먼저 출력한다. 
// 만약, 그러한 합과 차를 갖는 경기 결과가 없다면, -1을 출력한다.

public class Baekjoon4299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b) {
			System.out.println("-1");
		}else {
			int x = (a+b)/2;
			int y = (a-b)/2;
			if(x+y==a&&x-y==b) {
				System.out.println(x+" "+y);
			}else {
				System.out.println("-1");
			}
		}
	}
}
