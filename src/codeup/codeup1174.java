package codeup;

import java.util.Scanner;

// 1174 : 30분전
//시와 분이 입력된다.
//( 시의 범위 : 0~ 23)
//(분의 범위 : 0~ 59)

// 입력된 시간의 30분 전의 시간을 출력하시오.

//예)
//12 35  =====> 12 5
//12 0 ======> 11 30
//11 5 ======> 10 35

// 아직 조건문을 배우지 않았기 때문에 if나 3항연산자를 사용하지 않고 풀기 바랍니다.

public class codeup1174 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		// 시간에 24시(1일)을 더해서 분으로 환산.
		int total = (hour+24)*60+min;
		// 30분을 뺸다.
		total -= 30;
		
		hour = (total/60)%24;	// 60으로 나눈 몫의 24로 나눈 나머지 (1일이 넘을수 있기 때문)
		min = total%60;		// 60으로 나눈 나머지

		System.out.printf("%d %d ", hour, min);

	}
}
