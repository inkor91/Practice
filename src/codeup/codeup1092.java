package codeup;

import java.util.Scanner;

// 1092 : [기초-종합] 함께 문제 푸는 날(설명) 
// 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
//매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
//예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
//한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.

//아래의 코드를 읽고 이해한 후 도전해 보자.
//day는 날 수, a/b/c는 방문 주기이다.
//...
//day=1;
//while(day%a!=0 || day%b!=0 || day%c!=0) day++; //이게 무슨 의미일까?
//printf(＂%d＂, day);


public class codeup1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int count = 1;
		// 세 사람이 같이 방문하는 날을 확인하기 위한 변수 count(방문날짜) 및 1로 초기화
		
		// while 문을 통해 조건에 맞지않을 때까지 반복 
		// => 세 사람의 방문날짜가 같지 않을 경우 => count 1을 증가
		// num1, num2, num3 셋 모두 나미지가 0 일떄 종료 => 세 사람의 방문날짜가 같은 날 
		while(count % num1 !=0 || count % num2 !=0 || count % num3 != 0) {
			count++;
		}
		System.out.println(count);
	}
}
