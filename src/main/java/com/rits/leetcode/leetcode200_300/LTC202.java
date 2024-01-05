package com.rits.leetcode.leetcode200_300;

/**
 * @author rits
 * @created on 05/01/2024
 * @project dsa
 */
public class LTC202 {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getSumOfSquare(n);
        while (fast != 1 && fast != slow){
            slow = getSumOfSquare(slow);
            fast = getSumOfSquare(getSumOfSquare(fast));
        }
        return fast == 1;
    }
    public static int getSumOfSquare(int n){
        int sum = 0;
        while (n > 0){
            int digit = n%10;
            n = n/10;
            sum += digit*digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(4));
    }
}
