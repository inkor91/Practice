package codeup;

import java.util.Scanner;

// 1222 : 축구의 신 2
// 지금 1반과 2반이 축구를 하고있다. 축구경기 타임은 총 90분이고,
// 현재 스코어가 5 대 7인 상황에서, 지고 있는 1반에서는 경남정보고 최고의 스트라이커인 성익이를 투입하기로 결정했다.
// 성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
// 만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
// (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 동내심판인 성빈이는 성익이가 잘 되는 것을 싫어하기 때문에 추가시간 따위는 주지 않는다. )
// 현재 경기타임과 스코어가 입력으로 주어 질때, 성익이를 투입하면 1반이 이길 수 있는지 결정하는 프로그램을 작성하시오.


// 세 정수가 차례로 입력된다. ( 현재 경기 타임,  1반득점, 2반득점 )

//현재 경기타임에 축구의 신 성익이를 투입하여 1반이 이길 수 있으면 "win", 동점이 되면 "same", 투입해도 이기지 못하면 "lose"를 출력하시오.
//(성익이는 해당 시간에 1반에만 투입되며, 성익이가 투입되면 성익이 외에는 양팀 모두 골을 넣지 못한다.)

public class codeup1222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		if(time<90) {
			score1 +=1;
			int r_time = 90-time;
			score1 += (r_time/5);
			
			if(r_time%5==0) {
				score1 -=1;
			}
		}
		
		if(score1==score2) {
			System.out.println("same");
		}else if(score1>score2) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}
