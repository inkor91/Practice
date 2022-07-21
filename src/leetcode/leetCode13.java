package leetcode;

// 13. Roman to Integer
// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//I can be placed before V (5) and X (10) to make 4 and 9. 
//X can be placed before L (50) and C (100) to make 40 and 90. 
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.

public class leetCode13 {
	public int romanToInt(String s) {
        int num = 0;
        int len = s.length();
        char c;
        
        for (int i = len - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c == 'I') {
                num += (num >= 5 || num >= 10) ? -1 : 1;
            } else if (c == 'V') {
                num += 5;
            } else if (c == 'X') {
                num += (num >= 50 || num >= 100) ? -10 : 10;
            } else if (c == 'L') {
                num += 50;
            } else if (c == 'C') {
                num += (num >= 500 || num >= 1000) ? -100 : 100;
            } else if (c == 'D') {
                num += 500;
            } else if (c == 'M') {
                num += 1000;
            }
        }
        return num;
    }
}
