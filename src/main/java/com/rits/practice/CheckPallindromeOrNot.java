package com.rits.practice;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 28/11/22
 */
public class CheckPallindromeOrNot {
    public static boolean checkPalindrome(int number){
        int temp = 0;
        int old = number;
        while (number > 0){
            temp = temp*10 + number%10;
            number = number / 10;
        }
        return (temp == old);

    }

    public static void main(String[] args) {
        int num = 000;
        System.out.println("Is Palindrome : "+checkPalindrome(num));

    }
}
