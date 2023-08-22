package com.rits.basics;

/**
 * @author rits
 * @created on 29/06/2023
 * @project dsa
 */
public class PalindromeCheck {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int res = 0;
        int temp = x;
        while (temp > 0){
            res = res * 10 + temp%10;
            temp = temp/10;
        }
        return res == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

}
