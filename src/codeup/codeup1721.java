package codeup;

import java.util.Scanner;

// 두 점 간의 거리 해
// 두 점 간의 거리를 소수점 2째 자리까지 출력 (소수점 아래 3째 자리에서 반올림)

public class codeup1721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = Integer.parseInt(sc.next());
		int y1 = Integer.parseInt(sc.next());
		int x2 = Integer.parseInt(sc.next());
		int y2 = Integer.parseInt(sc.next());
	
		int width = x2 - x1;
		int height = y2 - y1;
		
		double length = Math.sqrt(width*width+height*height);
		
		System.out.println(String.format("%.2f", length));
	}
}
