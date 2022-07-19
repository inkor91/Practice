package leetcode;

//9. Palindrome Number
//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.

public class leetCode09 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }
}
