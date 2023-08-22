package com.rits.basics;

/**
 * @author rits
 * @created on 20/02/2023
 * @project dsa
 */
public class ReverseNumber {
    static int reverseNumber(int x){
        if (x == Integer.MIN_VALUE){
            return 0;
        }
        int res = 0;
        boolean isNegative = false;
        if (x < 0){
            isNegative = true;
            x = -(x);
        }
        while (x > 0){
            if (res > Integer.MAX_VALUE/10){
                return 0;
            }
            res = res*10+x%10;
            x = x/10;
        }
        return isNegative?-(res):res;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(-1234577));
    }
}
