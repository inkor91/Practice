package codeup;

import java.util.Scanner;

public class codeup2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.next());

		int first = Integer.parseInt(sc.next());
		String path = null;
		 for (int i=0; i<count-1; i++) {
	        	int number = Integer.parseInt(sc.next()); 

	        	if (path == null) {
	        		if (number > first) {
	        			path = "오름차순";
	        		} else if (number < first) {
	        			path = "내림차순";
	        		}
	        		
	        		first = number;
	        	}
	        	
	        	else if (path.equals("오름차순")) { 
	        		if (number > first) {

	        		} else {
	        			path = "섞임";
	        		}
	        	}
	        	
	        	else if (path.equals("내림차순")) { 
	        		if (number < first) {

	        		} else {
	        			path = "섞임";
	        		}
	        	}
	        	
	        	else if (path.equals("섞임")) { 
	        		break;
	        	}
	        }
	        
	        System.out.println(path);
		}
}
