package baekjoon;

import java.util.Scanner;

// Contest Timing
// Line 1: This line contains 3 space-separated integers, D H M, 
// specifying the date and time at which Bessie ends the contest.
//D will be an integer in the range 11..14 telling the day of the month; 
//H and M are hours and minutes on a 24-hour clock 
//(so they range from H=0,M=0 at midnight up through H=23,M=59 at 11:59 PM).

// Line 1: The total number of minutes spent by Bessie in the contest, 
//or -1 if her ending time is earlier than her starting time.

public class Baekjoon5928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int total = 11 * 24 * 60 + 11*60 + 11;
		int ans = m + h * 60 + d * 60 * 24 - total;
		
		if(ans<0){
		System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}
