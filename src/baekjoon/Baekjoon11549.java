package baekjoon;

import java.util.Scanner;

// Blind tea tasting is the skill of identifying a tea by using only your senses of smell and taste.
// As part of the Ideal Challenge of Pure-Tea Consumers (ICPC), a local TV show is organized. 
// During the show, a full teapot is prepared and five contestants are handed a cup of tea each. 
// The participants must smell, taste and assess the sample so as to identify the tea type, 
// which can be: (1) white tea; (2) green tea; (3) black tea; or (4) herbal tea. 
// At the end, the answers are checked to determine the number of correct guesses.

// Given the actual tea type and the answers provided, determine the number of contestants who got the correct answer.

public class Baekjoon11549 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        int a = 0;
	        for(int i = 0; i < 5; i++){
	            if(sc.nextInt() == t) {
	            	a += 1;
	            }
	        }
	        System.out.println(a);
	    }
}
