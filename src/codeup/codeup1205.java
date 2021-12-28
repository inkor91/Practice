package codeup;

import java.util.Scanner;

public class codeup1205 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double a = sc.nextFloat(); 
	    double b = sc.nextFloat();
	    double c, d, e, f, g, h, i, j, k, l;

	    c = a + b;
	    d = b + a;
	    e = a - b;
	    f = b - a;
	    g = a * b;
	    h = b * a;
	    i = a / b;
	    j = b / a;
	    k = Math.pow(a, b);
	    l = Math.pow(b, a);

	    double array[] = {c, d, e, f, g, h, i, j, k, l};
	    double max = array[0];
	    for(int m = 0; m < array.length; m++) {
	      if(max<array[m]) {
	        max = array[m];
	      }			
	    }
	    System.out.printf("%.6f", max);    
	  }
	}

