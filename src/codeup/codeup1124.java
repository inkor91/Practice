package codeup;

import java.util.Scanner;

// 1124 : 분자량 구하기 1
//화학 숙제를 하던 광곽이는 분자량을 구하라는 문제를 보고 귀찮아 한다.
//귀찮은 광곽이를 위해서 화학식을 입력하면 분자량을 구해주는 프로그램을 만들어 주자!
//화학식은 CxHy의 꼴로 입력된다.
//C의 원자량은 12, H의 원자량은 1로 한다.
// C3H8 => 44
public class codeup1124 {
	public static void main(String[] args) {
		int C = 12;
		int H = 1;

		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		String [] c2 = c.split("H"); //C3, 8로 나눠짐
		c2[0] = c2[0].replaceAll("C", ""); // C 문자 제거(특정문자 제거)
		
		int CNum = Integer.parseInt(c2[0]);
		int HNum = Integer.parseInt(c2[1]);
		
		int result = C*CNum + H*HNum;
		System.out.println(result);
		
			
	}
}
