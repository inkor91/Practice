package codeup;

import java.util.Scanner;

public class codeup1420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] score = new int[n];
		String[]nameS = new String[n];
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
			nameS[i] = name[i]+" "+score[i];					
		}
		
		for (int i = 0; i < score.length; i++) {
			for(int j=0; j < score.length; j++) {
				if(score[i] > score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < nameS.length; i++) {
			if(nameS[i].contains(String.valueOf(score[2]))) {
				String[] result = nameS[i].split(" ");
				System.out.println(result[0]);
			}
		}
	}
}
