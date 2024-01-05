package com.rits.leetcode.leetcode41_80;

import java.math.BigInteger;

/**
 * @author rits
 * @created on 20/09/2023
 * @project dsa
 */
public class LTC43 {

    public static String multiply(String num1, String num2) {
        double first = 0;
        double second = 0;
        int k = 0;
        for (int i = num1.length()-1; i >= 0 ; i--) {
            int ch = Integer.parseInt(num1.charAt(i)+"");
            first += (Math.pow(10, k++) * ch);
        }
        k=0;
        for (int i = num2.length()-1; i >= 0 ; i--) {
            int ch = Integer.parseInt(num2.charAt(i)+"");
            second += (Math.pow(10, k++) * ch);
        }

        return first*second+"";

    }




    public static void main(String[] args) {
        String num1 = "123456789", num2 = "987654321";
        System.out.println(multiply(num1,num2));
    }
}
