package com.rits.leetcode.leetcode41_80;

/**
 * @author rits
 * @created on 01/01/2024
 * @project dsa
 */
public class Pallindrome {
    public static boolean isPalindrome(String s) {

        // Replace this placeholder return statement with your code
        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase().trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


        }
        while(start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
