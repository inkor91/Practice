package baekjoon;

import java.util.Scanner;

// Speed fines are not fine!
// The input will be two integers. The first line of input will be speed limit. 
//The second line of input will be the recorded speed of the car.


public class Baekjoon6763 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speedLimit = sc.nextInt();
		int recordedSpeed = sc.nextInt();
		
		if(recordedSpeed-speedLimit>=31) {
			System.out.println("You are speeding and your fine is $500.");
		}else if(recordedSpeed-speedLimit>=21 && recordedSpeed-speedLimit<=30 ) {
			System.out.println("You are speeding and your fine is $270.");
		}else if(recordedSpeed-speedLimit>=1 && recordedSpeed-speedLimit<=20) {
			System.out.println("You are speeding and your fine is $100.");
		}else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
				
	}
}
