package baekjoon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// 오늘의 날짜는?
// 2018 SCAL-MOOKJA에 출전하기로 한 무근이와 인서는 대회 준비를 위해 같이 모여 문제를 풀기로 했다.
// 그런데 어느 날, 일어나서 날짜를 확인해 보니 무근이와 인서의 시계가 서로 다른 날짜를 가리키고 있었다. 
// 두 사람이 정확한 날짜에 모일 수 있도록 문제를 푸는 지금 시각이 UTC+0(세계 표준시)을 기준으로 무슨 날짜인지 출력해 주는 프로그램을 작성하자.

public class Baekjoon16170 {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("UTC"); // 시간대 설정.

		Date date = new Date(); // Date 객채를 통해 현재 시간 불러오기.
		DateFormat yearFormat = new SimpleDateFormat("yyyy"); // 출력 포맷 설정
		DateFormat monthFormat = new SimpleDateFormat("MM"); // 출력 포맷 설정
		DateFormat dayFormat = new SimpleDateFormat("dd"); // 출력 포맷 설정

		// 출력 포맷 적용후 출력
		yearFormat.setTimeZone(tz); 
		System.out.println(yearFormat.format(date));
		System.out.println(monthFormat.format(date));
		System.out.println(dayFormat.format(date));
	}
}
