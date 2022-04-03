package baekjoon;

import java.util.Scanner;

// Which Alien?
// Canada Cosmos Control has received a report of another incident. 
// They believe that an alien has illegally entered our space. 
// A person who witnessed the appearance of the alien has come forward to describe the alien’s appearance. 
// It is your role within the CCC to determine which alien has arrived. 
// There are only 3 alien species that we are aware of, described below:
// TroyMartian, who has at least 3 antenna and at most 4 eyes;
// VladSaturnian, who has at most 6 antenna and at least 2 eyes;
// GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
// The first line contain the number of antenna that the witness claimed to have seen on the alien. 
//The second line contain the number of eyes seen on the alien.

public class Baekjoon6778 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int antenna = sc.nextInt();
		int eyes = sc.nextInt();
		
		if(antenna>=3 && eyes<= 4) {
			System.out.println("TroyMartian");
		}
		if(antenna<=6 && eyes >=2) {
			System.out.println("VladSaturnian");
		}
		if(antenna<=2 && eyes <=3) {
			System.out.println("GraemeMercurian");
		}
	}
}
